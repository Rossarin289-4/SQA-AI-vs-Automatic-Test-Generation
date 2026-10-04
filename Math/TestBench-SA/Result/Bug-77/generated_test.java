package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "set", new String[]{"int", "org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapMultiplyToSelf", "double", "-1097961340710804027"}, {"org.apache.commons.math.linear.ArrayRealVector", "append", "org.apache.commons.math.linear.ArrayRealVector", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getDistance", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(-Infinity)} {getData=[-Infinity], getDataRef=[-Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); 0} {getData=[-Infinity, 0.0], getDataRef=[-Infinity, 0.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"8772222695580707260"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCbrtToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "equals", "java.lang.Object", "<sample:1>"}}, 2), new String[][]{{"mapAtanToSelf", "", "7"}, {"mapAcos", "", "2"}, {"getDistance", "org.apache.commons.math.linear.RealVector", "6"}, {"append", "org.apache.commons.math.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "setEntry", "int,double", "-2147483648", "-1097961340710804027"}}), new String[][]{{"mapAtanToSelf", "", "7"}, {"mapAcos", "", "2"}, {"getDistance", "org.apache.commons.math.linear.RealVector", "2"}, {"append", "org.apache.commons.math.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", "double", "1.7544445391161414E19"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapExpm1ToSelf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", "double", "8772222695580707260"}, {"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -0.6321205588285577], getDimension=2, getL1Norm=1.6321205588285577, getLInfNorm=1.0, getNorm=1.1830369397840999, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -0.6321205588285577], getDimension=2, getL1Norm=1.6321205588285577, getLInfNorm=1.0, getNorm=1.1830369397840999, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPow", new String[]{"double"}, new String[]{"12.21005875"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "-67108863", "<sample:5>"}}), new String[][]{{"getL1Distance", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapPow", new String[]{"double"}, new String[]{"-0.0"}, false, 8, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:3>"}, {"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.ArrayRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapCoshToSelf", ""}}, 3), new String[][]{{"mapCeil", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1} {getData=[1.0], getDataRef=[1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity)} {getData=[Infinity], getDataRef=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapPow", new String[]{"double"}, new String[]{"-5.922000000000001"}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapCosh", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.ArrayRealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; 0; (NaN); 0} {getData=[0.0, 0.0, NaN, 0.0], getDataRef=[0.0, 0.0, NaN, 0.0], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanh", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapCoshToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSignumToSelf", ""}}, 1), new String[][]{{"mapCoshToSelf", "", "2"}, {"mapAtan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0.92} {getData=[0.9166975951315558], getDataRef=[0.9166975951315558], getDimension=1, getL1Norm=0.9166975951315558, getLInfNorm=0.9166975951315558, getNorm=0.9166975951315558, isInfinite=false, isNaN...#207#-1829382337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1} {getData=[1.0], getDataRef=[1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanh", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSignumToSelf", ""}}), new String[][]{{"mapCoshToSelf", "", "3"}, {"mapAtan", "", "3"}, {"append", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0.79; 0.79; 0.79; 0.79; 0.79; 0.79; 0.79; 0.79; 0.79; 0} {getData=[0.7853981633974483, 0.7853981633974483, 0.7853981633974483,.., getDataRef=[0.7853981633974483, 0.7853981633974483, 0.785398163397448...#343#1198294321", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0; 0; 0; 0; 0; 0; 0; 0; 0} {getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDataRef=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=9, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0....#233#1751552831", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanh", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAtan", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}}, 3), new String[][]{{"mapCoshToSelf", "", "3"}, {"mapAtan", "", "3"}, {"mapExpm1", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.5; 1.5; 1.5; 1.5; 1.5; 1.5; 1.5} {getData=[1.5010173650937055, 1.5010173650937055, 1.5010173650937055,.., getDataRef=[1.5010173650937055, 1.5010173650937055, 1.5010173650937055,.., getDimension=7, ...#320#2061947689", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1; -1; -1; -1; -1} {getData=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0], getDimension=7, getL1Norm=7.0, getLInfNorm=1.0, getNorm=2.64575...#243#-1767258355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"-5.489806703553959E15"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:3>"}}, 1), new String[][]{{"getLInfDistance", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"-1.0"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapTanToSelf", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog10", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "-0.0235"}}, 1), new String[][]{{"getLInfDistance", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("43.5531914893617", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[42.5531914893617], getDimension=1, getL1Norm=42.5531914893617, getLInfNorm=42.5531914893617, getNorm=42.5531914893617, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"-0.0"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}}), new String[][]{{"add", "org.apache.commons.math.linear.OpenMapRealVector", "3"}, {"append", "org.apache.commons.math.linear.RealVector", "0"}, {"mapFloorToSelf", "", "3"}, {"getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, 1.0], getDimension=2, getL1Norm=2.0, getLInfNorm=1.0, getNorm=1.4142135623730951, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "set", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "append", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "unitize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSinToSelf", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-0.58; -0.58; -0.58} {getData=[-0.5773502691896257, -0.5773502691896257, -0.57735026918962.., getDataRef=[-0.5773502691896257, -0.5773502691896257, -0.57735026918962.., getDimension=3, getL1Norm=1.73...#291#1723807422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"2.3000000000000003"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "0", "<sample:4>"}}, 3), new String[][]{{"add", "org.apache.commons.math.linear.OpenMapRealVector", "3"}, {"ebeDivide", "double[]", "7"}, {"append", "org.apache.commons.math.linear.OpenMapRealVector", "4"}, {"getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"1.0"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "0", "<sample:3>"}}, 3), new String[][]{{"getSubVector", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapUlpToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAdd", "double", "0.6052000000000006"}, {"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "double[]", "<empty>"}, {"org.apache.commons.math.linear.ArrayRealVector", "outerProduct", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapLog1pToSelf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "add", "org.apache.commons.math.linear.ArrayRealVector", "<sample:6>"}, {"org.apache.commons.math.linear.ArrayRealVector", "getSubVector", "int,int", "14", "-2"}}, 3), new String[][]{{"mapCosh", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (Infinity)} {getData=[NaN, Infinity], getDataRef=[NaN, Infinity], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (-Infinity)} {getData=[NaN, -Infinity], getDataRef=[NaN, -Infinity], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-2147483648", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAcosToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "projection", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "add", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "unitVector", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "-0.552"}}, 2), new String[][]{{"getLInfNorm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "add", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapRint", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "0.09009"}}, 2), new String[][]{{"getL1Distance", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "add", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapLog10ToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "outerProduct", "org.apache.commons.math.linear.RealVector", "<sample:5>"}}, 2), new String[][]{{"mapCbrtToSelf", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getData=[NaN, NaN], getDataRef=[NaN, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN)} {getData=[NaN, NaN], getDataRef=[NaN, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanhToSelf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCos", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "copy", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapCbrtToSelf", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "47", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.5403023058681398, 0.5403023058681398, 0.5403023058681398,.., getDimension=64, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,.., getDimension=64, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapTan", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapTan", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapTanh", ""}}), new String[][]{{"append", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; 1; 1; -1} {getData=[1.0, 1.0, 1.0, -1.0], getDataRef=[1.0, 1.0, 1.0, -1.0], getDimension=4, getL1Norm=4.0, getLInfNorm=1.0, getNorm=2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getData=[1.0, Infinity, -Infinity], getDataRef=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, is...#210#1100100154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapLogToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getData=[NaN, NaN, NaN], getDataRef=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getData=[NaN, NaN, NaN], getDataRef=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAsinToSelf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "0", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "18.018"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog10ToSelf", ""}}), new String[][]{{"iterator", "", "2"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, NaN, NaN, NaN, NaN, NaN], getDimension=7, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"2147483647", "10"}, false, 10, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", new String[]{"double"}, new String[]{"0.1399999999998"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "unitVector", ""}}), new String[][]{{"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAcos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "append", "double", "2.19305567389517645E18"}}), new String[][]{{"mapAtan", "", "5"}, {"mapCeil", "", "1"}, {"getL1Distance", "org.apache.commons.math.linear.RealVector", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanhToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getL1Distance", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "append", "double", "-5.489806703553959E15"}}, 3), new String[][]{{"mapExp", "", "5"}, {"mapCeil", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{3; 1; 1; 1} {getData=[3.0, 1.0, 1.0, 1.0], getDataRef=[3.0, 1.0, 1.0, 1.0], getDimension=4, getL1Norm=6.0, getLInfNorm=3.0, getNorm=3.4641016151377544, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; -1; -0.76; -1} {getData=[1.0, -1.0, -0.7615941559557649, -1.0], getDataRef=[1.0, -1.0, -0.7615941559557649, -1.0], getDimension=4, getL1Norm=3.761594155955765, getLInfNorm=1.0, getNorm=1.892095573...#238#-1537954227", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<null>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, getSparcity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"-2.19305567389517568E18"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitize", ""}}, 3), new String[][]{{"getLInfDistance", "org.apache.commons.math.linear.RealVector", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapInv", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "toArray", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity)} {getData=[Infinity, -Infinity], getDataRef=[Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCos", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "setSubVector", "int,double[]", "1", "<sample:3>"}}), new String[][]{{"mapCosToSelf", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getData=[NaN, NaN], getDataRef=[NaN, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (Infinity)} {getData=[Infinity, Infinity], getDataRef=[Infinity, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSin", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:5>"}}, 2), new String[][]{{"mapAbs", "", "0"}, {"mapAcos", "", "0"}, {"append", "org.apache.commons.math.linear.ArrayRealVector", "0"}, {"mapAdd", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (Infinity)} {getData=[NaN, Infinity], getDataRef=[NaN, Infinity], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAsin", ""}}, 2), new String[][]{{"mapFloorToSelf", "", "1"}, {"mapFloor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); -1; (NaN)} {getData=[NaN, NaN, -1.0, NaN], getDataRef=[NaN, NaN, -1.0, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); -1; (NaN)} {getData=[NaN, NaN, -1.0, NaN], getDataRef=[NaN, NaN, -1.0, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "add", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapDivide", "double", "1.0"}, {"org.apache.commons.math.linear.ArrayRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "2", "<sample:3>"}}), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(Infinity); (Infinity); 0; (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity)} {getData=[Infinity, Infinity, 2.220446049250313E-16, Infinity, I...#390#-688601978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "2", "<sample:5>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSignum", ""}}), new String[][]{{"isInfinite", "", "0"}, {"getLInfNorm", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0; 0; (Infinity)} {getData=[2.220446049250313E-16, 2.220446049250313E-16, Infinity], getDataRef=[2.220446049250313E-16, 2.220446049250313E-16, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNo...#260#-102393207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSignum", ""}}), new String[][]{{"isInfinite", "", "0"}, {"getLInfNorm", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinh", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapCosToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:1>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSqrtToSelf", ""}}, 3), new String[][]{{"getDistance", "org.apache.commons.math.linear.RealVector", "5"}, {"mapAcos", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); 0.64} {getData=[NaN, 0.638390825662003], getDataRef=[NaN, 0.638390825662003], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); 0.74} {getData=[NaN, 0.7350525871447157], getDataRef=[NaN, 0.7350525871447157], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCos", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "projection", "double[]", "<sample:4>"}}), new String[][]{{"getL1Norm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapTan", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "projection", "double[]", "<null>"}, {"org.apache.commons.math.linear.ArrayRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", new String[]{"double"}, new String[]{"-0.15130000000000016"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "add", "org.apache.commons.math.linear.RealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "projection", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<null>"}}, 3), new String[][]{{"dotProduct", "org.apache.commons.math.linear.RealVector", "6"}, {"append", "double[]", "1"}, {"mapAsin", "", "4"}, {"mapExpToSelf", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, 4.810477380965351], getDimension=2, getL1Norm=5.810477380965351, getLInfNorm=4.810477380965351, getNorm=4.913317884360757, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapFloorToSelf", new String[]{}, new String[]{}, false), new String[][]{{"append", "double", "2"}, {"getLInfDistance", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:14>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:./uf[1>"}}, 3), new String[][]{{"append", "org.apache.commons.math.linear.OpenMapRealVector", "6"}, {"getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAsinToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapLog", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:kyz>"}}), new String[][]{{"ebeMultiply", "org.apache.commons.math.linear.RealVector", "6"}, {"getDistance", "org.apache.commons.math.linear.RealVector", "4"}, {"append", "double", "5"}, {"ebeDivide", "org.apache.commons.math.linear.RealVector", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "outerProduct", "org.apache.commons.math.linear.ArrayRealVector", "<sample:3>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtractToSelf", "double", "-0.15130000000000016"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapInvToSelf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapTan", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "unitize", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapLog1pToSelf", ""}}), new String[][]{{"mapExp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity)} {getData=[Infinity], getDataRef=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity)} {getData=[Infinity], getDataRef=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapFloor", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfNorm", ""}}, 3), new String[][]{{"ebeMultiply", "org.apache.commons.math.linear.ArrayRealVector", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (Infinity); 1; (Infinity)} {getData=[Infinity, Infinity, 1.0, Infinity], getDataRef=[Infinity, Infinity, 1.0, Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=...#239#-1172591986", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAbs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "iterator", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAbs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0...#885#1532481268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "-4.9E-324"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.6931471805599453, Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.6931471805599453, Infinity, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "-4.9E-324"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "0.018000000000000002"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, -Infinity], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "0.18000000000000002"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "0.18000000000000002"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "0.18000000000000002"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.25, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "0.18000000000000002"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, NaN, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "0.18000000000000002"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=6, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapFloorToSelf", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=7, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapFloorToSelf", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.6931471805599453, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.6931471805599453, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapFloorToSelf", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=9, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapFloorToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapFloorToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=12, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapFloorToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, getSparcity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, 3.141592653589793], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[3.141592653589793, 3.141592653589793, 3.141592653589793], getDimension=3, getL1Norm=9.42477796076938, getLInfNorm=3.141592653589793, getNorm=5.441398092702653, getSparcity=1.0, isInfinite=fa...#217#-49719552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"mapDivideToSelf", "double", "7"}, {"mapAddToSelf", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"mapDivideToSelf", "double", "7"}, {"mapAddToSelf", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN], getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"mapDivideToSelf", "double", "7"}, {"mapAddToSelf", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"mapDivideToSelf", "double", "7"}, {"mapAddToSelf", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, Infinity, Infinity, Infinity, Infinity, Infinity], getDimension=6, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=6, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2), new String[][]{{"mapDivideToSelf", "double", "7"}, {"mapAddToSelf", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, Infinity, Infinity, Infinity, Infinity, Infinity,.., getDimension=7, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=7, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCos", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.25, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); -2} {getData=[-Infinity, -2.0], getDataRef=[-Infinity, -2.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); 0} {getData=[-Infinity, 0.0], getDataRef=[-Infinity, 0.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"add", "double[]", "4"}, {"mapAcosToSelf", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); 1.57} {getData=[NaN, 1.5707963267948966], getDataRef=[NaN, 1.5707963267948966], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"add", "double[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"add", "double[]", "4"}, {"mapAcosToSelf", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); 3.14} {getData=[NaN, 3.141592653589793], getDataRef=[NaN, 3.141592653589793], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", "double", "-1.0E-12"}, {"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 3), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<sample:2>"}}, 3), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=9, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "1", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "1", "<sample:6>"}}, 3), new String[][]{{"getDistance", "org.apache.commons.math.linear.RealVector", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}}, 2), new String[][]{{"isNaN", "", "2"}, {"append", "org.apache.commons.math.linear.OpenMapRealVector", "2"}, {"getSparcity", "", "1"}, {"getDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}}, 2), new String[][]{{"isNaN", "", "2"}, {"append", "org.apache.commons.math.linear.OpenMapRealVector", "2"}, {"getSparcity", "", "1"}, {"getDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"4.999999999999998E-15"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:7>"}}, 2), new String[][]{{"mapExpm1", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 13, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapTan", ""}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity)} {getData=[Infinity, Infinity, Infinity, Infinity, Infin...#399#1858749117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.01175"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.011749999999999778, -0.011749999999999778, -0.011749999999999778]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-0.01; -0.01; -0.01} {getData=[-0.011749999999999778, -0.011749999999999778, -0.0117499999.., getDataRef=[-0.011749999999999778, -0.011749999999999778, -0.0117499999.., getDimension=3, getL1Norm=0.03...#311#1431293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.01175"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.011749999999999778, -0.011749999999999778, -0.011749999999999778]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-0.01; -0.01; -0.01} {getData=[-0.011749999999999778, -0.011749999999999778, -0.0117499999.., getDataRef=[-0.011749999999999778, -0.011749999999999778, -0.0117499999.., getDimension=3, getL1Norm=0.03...#311#1431293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.01175"}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.01175"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.011750000000000222, 0.011750000000000222, 0.011750000000000222]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.01; 0.01; 0.01} {getData=[0.011750000000000222, 0.011750000000000222, 0.0117500000000.., getDataRef=[0.011750000000000222, 0.011750000000000222, 0.0117500000000.., getDimension=3, getL1Norm=0.03525...#307#-1530540355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.01175"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.98825, -0.98825, -0.98825]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-0.99; -0.99; -0.99} {getData=[-0.98825, -0.98825, -0.98825], getDataRef=[-0.98825, -0.98825, -0.98825], getDimension=3, getL1Norm=2.96475, getLInfNorm=0.98825, getNorm=1.711699210579943, isInfinite=...#219#1947419657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.0235"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.023500000000000222, 0.023500000000000222, 0.023500000000000222]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.02; 0.02; 0.02} {getData=[0.023500000000000222, 0.023500000000000222, 0.0235000000000.., getDataRef=[0.023500000000000222, 0.023500000000000222, 0.0235000000000.., getDimension=3, getL1Norm=0.07050...#305#-283439335", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.023499999999999997"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.02350000000000022, 0.02350000000000022, 0.02350000000000022]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.02; 0.02; 0.02} {getData=[0.02350000000000022, 0.02350000000000022, 0.023500000000000.., getDataRef=[0.02350000000000022, 0.02350000000000022, 0.023500000000000.., getDimension=3, getL1Norm=0.07050...#304#499493180", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.014499999999999996"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.014500000000000218, 0.014500000000000218, 0.014500000000000218]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.01; 0.01; 0.01} {getData=[0.014500000000000218, 0.014500000000000218, 0.0145000000000.., getDataRef=[0.014500000000000218, 0.014500000000000218, 0.0145000000000.., getDimension=3, getL1Norm=0.04350...#306#-1100499982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.014499999999999994"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.014499999999999772, -0.014499999999999772, -0.014499999999999772]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-0.01; -0.01; -0.01} {getData=[-0.014499999999999772, -0.014499999999999772, -0.0144999999.., getDataRef=[-0.014499999999999772, -0.014499999999999772, -0.0144999999.., getDimension=3, getL1Norm=0.04...#311#-1102103070", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.014499999999999994"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -0.014499999999999772]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); -0.01} {getData=[Infinity, -0.014499999999999772], getDataRef=[Infinity, -0.014499999999999772], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=tru...#215#-1166944807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.14499999999999993"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8772222695580707260"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -0.1449999999999997]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); -0.14} {getData=[Infinity, -0.1449999999999997], getDataRef=[Infinity, -0.1449999999999997], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, i...#211#-584494897", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.14499999999999993"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}, 1), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.145]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1.15} {getData=[-Infinity, -1.145], getDataRef=[-Infinity, -1.145], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-1.0175999999999994"}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "set", "int,org.apache.commons.math.linear.ArrayRealVector", "-2147483648", "<sample:2>"}}, 3), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.0175999999999994, -2.0175999999999994, -2.0175999999999994, -2.0175999999999994, -2.0175999999999994, -2.0175999999999994, -2.0175999999999994]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-2.02; -2.02; -2.02; -2.02; -2.02; -2.02; -2.02} {getData=[-2.0175999999999994, -2.0175999999999994, -2.01759999999999.., getDataRef=[-2.0175999999999994, -2.0175999999999994, -2.01759999999999.., ge...#333#883399438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-1097961340710804027"}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "set", "int,org.apache.commons.math.linear.ArrayRealVector", "-2147483648", "<sample:2>"}}, 3), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.09796134071080397E18, -1.09796134071080397E18, -1.09796134071080397E18, -1.09796134071080397E18, -1.09796134071080397E18, -1.09796134071080397E18, -1.09796134071080397E18]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1,097,961,340,710,803,970; -1,097,961,340,710,803,970; -1,097,961,340,710,803,970; -1,097,961,340,710,803,970; -1,097,961,340,710,803,970; -1,097,961,340,710,803,970; -1,097,961,340,710,803,970} {ge...#491#346632487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-5.4898067035540198E17"}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "set", "int,org.apache.commons.math.linear.ArrayRealVector", "-2147483648", "<sample:2>"}}, 3), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-5.4898067035540198E17, -5.4898067035540198E17, -5.4898067035540198E17, -5.4898067035540198E17, -5.4898067035540198E17, -5.4898067035540198E17, -5.4898067035540198E17]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-548,980,670,355,401,980; -548,980,670,355,401,980; -548,980,670,355,401,980; -548,980,670,355,401,980; -548,980,670,355,401,980; -548,980,670,355,401,980; -548,980,670,355,401,980} {getData=[-5.4898...#477#1678144570", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"1.7544445391161414E19"}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.ArrayRealVector", "set", "int,org.apache.commons.math.linear.ArrayRealVector", "-2147483648", "<sample:2>"}}, 3), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.7544445391161414E19, 1.7544445391161414E19, 1.7544445391161414E19, 1.7544445391161414E19, 1.7544445391161414E19, 1.7544445391161414E19, 1.7544445391161414E19]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{17,544,445,391,161,414,000; 17,544,445,391,161,414,000; 17,544,445,391,161,414,000; 17,544,445,391,161,414,000; 17,544,445,391,161,414,000; 17,544,445,391,161,414,000; 17,544,445,391,161,414,000} {ge...#489#-1900431239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"1.75444453911614131E18"}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.ArrayRealVector", "set", "int,org.apache.commons.math.linear.ArrayRealVector", "-2147483648", "<sample:2>"}}, 3), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.75444453911614131E18, 1.75444453911614131E18, 1.75444453911614131E18, 1.75444453911614131E18, 1.75444453911614131E18, 1.75444453911614131E18, 1.75444453911614131E18]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1,754,444,539,116,141,310; 1,754,444,539,116,141,310; 1,754,444,539,116,141,310; 1,754,444,539,116,141,310; 1,754,444,539,116,141,310; 1,754,444,539,116,141,310; 1,754,444,539,116,141,310} {getData=[...#484#2056052336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"1.75444453911614106E18"}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.ArrayRealVector", "set", "int,org.apache.commons.math.linear.ArrayRealVector", "-2147483648", "<sample:2>"}}, 3), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.75444453911614106E18, 1.75444453911614106E18, 1.75444453911614106E18, 1.75444453911614106E18, 1.75444453911614106E18, 1.75444453911614106E18, 1.75444453911614106E18]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1,754,444,539,116,141,060; 1,754,444,539,116,141,060; 1,754,444,539,116,141,060; 1,754,444,539,116,141,060; 1,754,444,539,116,141,060; 1,754,444,539,116,141,060; 1,754,444,539,116,141,060} {getData=[...#484#-153508370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"Infinity"}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.ArrayRealVector", "set", "int,org.apache.commons.math.linear.ArrayRealVector", "-2147483648", "<sample:2>"}}, 3), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity)} {getData=[Infinity, Infinity, Infinity, Infinity, Infinity, Infinity,.., getDataRef=[Infinity, Infinity, Infinity, ...#338#1239130897", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"Infinity"}, false, 8, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAcosToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 3), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN)} {getData=[NaN], getDataRef=[NaN], getDimension=1, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"Infinity"}, false, 8, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:8>"}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 3), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity)} {getData=[Infinity], getDataRef=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "8772222695580707260"}}, 2), new String[][]{{"mapAtanToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57} {getData=[1.5707963267948966, 1.5707963267948966, 1.5707963267948966,.., getDataRef=[1.5707963267948966, 1.5707963267948966, 1....#356#-1459355742", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57} {getData=[1.5707963267948966, 1.5707963267948966, 1.5707963267948966,.., getDataRef=[1.5707963267948966, 1.5707963267948966, 1....#356#-1459355742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "8772222695580707260"}}, 2), new String[][]{{"mapAtanToSelf", "", "7"}, {"mapAcos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN); (NaN); (NaN); (NaN); (NaN); (NaN); (NaN); (NaN); (NaN); (NaN)} {getData=[NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN, NaN], getDataRef=[NaN, NaN, NaN, NaN, NaN, NaN, Na...#320#-592103090", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57} {getData=[1.5707963267948966, 1.5707963267948966, 1.5707963267948966,.., getDataRef=[1.5707963267948966, 1.5707963267948966, 1....#356#-1459355742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "8772222695580707260"}}, 2), new String[][]{{"mapAtanToSelf", "", "7"}, {"mapAcos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "8772222695580707260"}}, 2), new String[][]{{"mapAtanToSelf", "", "7"}, {"mapAcos", "", "2"}, {"getDistance", "org.apache.commons.math.linear.RealVector", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"mapAtanToSelf", "", "7"}, {"getDataRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"mapAtanToSelf", "", "7"}, {"mapAcos", "", "2"}, {"getDistance", "org.apache.commons.math.linear.RealVector", "6"}, {"append", "org.apache.commons.math.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "equals", "java.lang.Object", "<sample:1>"}}, 2), new String[][]{{"mapAtanToSelf", "", "7"}, {"mapAcos", "", "2"}, {"getDistance", "org.apache.commons.math.linear.RealVector", "2"}, {"append", "org.apache.commons.math.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"mapAtanToSelf", "", "7"}, {"mapAcos", "", "2"}, {"getDistance", "org.apache.commons.math.linear.RealVector", "2"}, {"append", "org.apache.commons.math.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSinhToSelf", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDimension=3, getL1Norm=3.525603580931404, getLInfNorm=1.1752011936438014, getNorm=2.0355081765066547, getSparcity=1.0, isInf...#225#2080270351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSinhToSelf", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", "double", "8.7722226955807068E18"}}, 2), new String[][]{{"mapAbsToSelf", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTan", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getData=[1.0, Infinity, -Infinity], getDataRef=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, is...#210#1100100154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1} {getData=[-1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getDistance", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getData", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "getDistance", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getData", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "getDistance", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1; -1; -1; -1; -1} {getData=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0], getDimension=7, getL1Norm=7.0, getLInfNorm=1.0, getNorm=2.64575...#243#-1767258355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity)} {getData=[Infinity, -Infinity], getDataRef=[Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setEntry", new String[]{"int", "double"}, new String[]{"0", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity)} {getData=[-Infinity, -Infinity, -Infinity, ...#411#-7261707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapExpToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAsinToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSignum", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{4.81; (NaN)} {getData=[4.810477380965351, NaN], getDataRef=[4.810477380965351, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{4.81; (NaN)} {getData=[4.810477380965351, NaN], getDataRef=[4.810477380965351, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapExpToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAsinToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSignum", ""}}), new String[][]{{"append", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{4.81; (NaN); -1} {getData=[4.810477380965351, NaN, -1.0], getDataRef=[4.810477380965351, NaN, -1.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{4.81; (NaN)} {getData=[4.810477380965351, NaN], getDataRef=[4.810477380965351, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapExpToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAsinToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSignum", ""}}), new String[][]{{"append", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0.21; (NaN); -1} {getData=[NaN, NaN, 0.20787957635076193, NaN, -1.0], getDataRef=[NaN, NaN, 0.20787957635076193, NaN, -1.0], getDimension=5, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN,...#230#-1500013014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); 0.21; (NaN)} {getData=[NaN, NaN, 0.20787957635076193, NaN], getDataRef=[NaN, NaN, 0.20787957635076193, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=fals...#214#-1610683328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapExpToSelf", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAsinToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSignum", ""}}), new String[][]{{"append", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); -1} {getData=[NaN, -1.0], getDataRef=[NaN, -1.0], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN)} {getData=[NaN], getDataRef=[NaN], getDimension=1, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapExpToSelf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAsinToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSignum", ""}}), new String[][]{{"append", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0.21; 0.21; 0.21; 0.21; 0.21; 0.21; 0.21; -1} {getData=[0.20787957635076193, 0.20787957635076193, 0.207879576350761.., getDataRef=[0.20787957635076193, 0.20787957635076193, 0.207879576350761.., getDi...#316#-896463150", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.21; 0.21; 0.21; 0.21; 0.21; 0.21; 0.21} {getData=[0.20787957635076193, 0.20787957635076193, 0.207879576350761.., getDataRef=[0.20787957635076193, 0.20787957635076193, 0.207879576350761.., getDimens...#326#1664229563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapLog10ToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanToSelf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapLog10ToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; (NaN); (NaN)} {getData=[0.0, NaN, NaN], getDataRef=[0.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0; (NaN); (NaN)} {getData=[0.0, NaN, NaN], getDataRef=[0.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "dotProduct", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAcos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "dotProduct", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAcos", ""}}), new String[][]{{"getL1Norm", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "dotProduct", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAcos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity)} {getData=[-Infinity], getDataRef=[-Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity)} {getData=[-Infinity], getDataRef=[-Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "dotProduct", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAcos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-1; -1; -1; -1; -1; -1; -1} {getData=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0], getDimension=7, getL1Norm=7.0, getLInfNorm=1.0, getNorm=2.64575...#243#-1767258355", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1; -1; -1; -1; -1} {getData=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0], getDimension=7, getL1Norm=7.0, getLInfNorm=1.0, getNorm=2.64575...#243#-1767258355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "dotProduct", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAcos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "dotProduct", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAcos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity)} {getData=[-Infinity, -Infinity, -Infinity, ...#411#-7261707", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity)} {getData=[-Infinity, -Infinity, -Infinity, ...#411#-7261707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAcos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0...#885#1532481268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0; 0...#885#1532481268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.6931471805599453, Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.6931471805599453, Infinity, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.6931471805599453, Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.6931471805599453, Infinity, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "0.0"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.6931471805599453, Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.6931471805599453, Infinity, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "0.0"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "-0.0"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "-4.9E-324"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.6931471805599453, Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.6931471805599453, Infinity, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAsin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAsin", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.57; (NaN); (NaN)} {getData=[1.5707963267948966, NaN, NaN], getDataRef=[1.5707963267948966, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getData=[1.0, Infinity, -Infinity], getDataRef=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, is...#210#1100100154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAsin", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.5707963267948966, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getData=[1.0, Infinity, -Infinity], getDataRef=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, is...#210#1100100154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAsin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}}), new String[][]{{"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.5707963267948966, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getData=[1.0, Infinity, -Infinity], getDataRef=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, is...#210#1100100154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAsin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}}), new String[][]{{"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAsin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}}), new String[][]{{"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, -1.5707963267948966]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAsin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}}), new String[][]{{"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.5707963267948966, -1.5707963267948966, -1.5707963267948966]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1} {getData=[-1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.5707963267948966], getDimension=1, getL1Norm=1.5707963267948966, getLInfNorm=1.5707963267948966, getNorm=1.5707963267948966, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcos", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, 3.141592653589793], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.18; (Infinity); (-Infinity)} {getData=[1.1752011936438014, Infinity, -Infinity], getDataRef=[1.1752011936438014, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getN...#243#-1260393955", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.18; (Infinity); (-Infinity)} {getData=[1.1752011936438014, Infinity, -Infinity], getDataRef=[1.1752011936438014, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getN...#243#-1260393955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); -1.18} {getData=[-Infinity, -1.1752011936438014], getDataRef=[-Infinity, -1.1752011936438014], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true...#214#-285976621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1.18} {getData=[-Infinity, -1.1752011936438014], getDataRef=[-Infinity, -1.1752011936438014], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true...#214#-285976621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-1.18; -1.18; -1.18} {getData=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDataRef=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDimension=3, getL1Norm=3.52...#305#-1446244548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1.18; -1.18; -1.18} {getData=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDataRef=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDimension=3, getL1Norm=3.52...#305#-1446244548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.18; (Infinity)} {getData=[1.1752011936438014, Infinity], getDataRef=[1.1752011936438014, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNa...#208#-109279", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.18; (Infinity)} {getData=[1.1752011936438014, Infinity], getDataRef=[1.1752011936438014, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNa...#208#-109279", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (-Infinity)} {getData=[Infinity, -Infinity], getDataRef=[Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity)} {getData=[Infinity, -Infinity], getDataRef=[Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:2>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:2>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}}), new String[][]{{"getDataRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:2>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}}), new String[][]{{"getDataRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity); (-Infinity)} {getData=[-Infinity, -Infinity, -Infinity, ...#411#-7261707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.ArrayRealVector", "<sample:6>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}}), new String[][]{{"mapDivideToSelf", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAsinToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAsinToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, -1.0], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, -1.5707963267948966], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAsinToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.5707963267948966, -1.5707963267948966, -1.57079632679489.., getDimension=3, getL1Norm=4.71238898038469, getLInfNorm=1.5707963267948966, getNorm=2.7206990463513265, getSparcity=1.0, isInfi...#224#-1401559280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAsinToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAsinToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.25, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.25, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAsinToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.5707963267948966, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapTan", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapAsinToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapTan", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapAsinToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=6, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=6, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCosh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCosh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}}), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCosh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}}), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); 0} {getData=[-Infinity, 0.0], getDataRef=[-Infinity, 0.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCosh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}}), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); (-Infinity)} {getData=[-Infinity, -Infinity], getDataRef=[-Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCosh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "1.7976931348623157E308"}}), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); -2} {getData=[-Infinity, -2.0], getDataRef=[-Infinity, -2.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"add", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); (-Infinity)} {getData=[-Infinity, -Infinity], getDataRef=[-Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "Infinity"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"add", "double[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapLog10ToSelf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapFloorToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, Infinity, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, Infinity, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"add", "double[]", "4"}, {"mapAcosToSelf", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); 3.14} {getData=[NaN, 3.141592653589793], getDataRef=[NaN, 3.141592653589793], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"add", "double[]", "4"}, {"dotProduct", "org.apache.commons.math.linear.ArrayRealVector", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapRintToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "toArray", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "set", "int,org.apache.commons.math.linear.ArrayRealVector", "-1", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapLog10", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCeil", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:8>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}), new String[][]{{"getDistance", "org.apache.commons.math.linear.RealVector", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getEntry", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "0.0"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapCbrtToSelf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "-0.0"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "-0.0"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "-2147483648", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -Infinity, -Infinity, -Infinity, -Infinity, -Inf.., getDimension=9, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=9, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "-3.900000000000001"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "2147483647", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0], getDimension=12, getL1Norm=12.0, getLInfNorm=1.0, getNorm=3.4641016151377544, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=12, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "-3.900000000000001"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "2147483647", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, 1.0], getDimension=2, getL1Norm=2.0, getLInfNorm=1.0, getNorm=1.4142135623730951, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, getSparcity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "iterator", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "-3.900000000000001"}}), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcosToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "iterator", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", ""}}), new String[][]{{"isNaN", "", "2"}, {"append", "org.apache.commons.math.linear.OpenMapRealVector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0, -1.0,.., getDimension=20, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.7, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=12, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapExp", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", "double", "-1097961340710804027"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "org.apache.commons.math.linear.RealVector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity], getDimension=1, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"8772222695580707260"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<null>"}}), new String[][]{{"mapExpm1", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"1.7544445391161414E19"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:1>"}, {"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<null>"}}), new String[][]{{"mapExpm1", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"4.999999999999998E-15"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:7>"}}), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"9.00000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:6>"}, {"org.apache.commons.math.linear.ArrayRealVector", "dotProduct", "double[]", "<sample:0>"}}), new String[][]{{"getData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"1.0"}, false, 12, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.0"}, false, 13, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapTan", ""}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity)} {getData=[Infinity, Infinity, Infinity, Infinity, Infin...#399#1858749117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.09099999999999994"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -0.909]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -0.91} {getData=[-Infinity, -0.909], getDataRef=[-Infinity, -0.909], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.18199999999999988"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapLog10", ""}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -0.8180000000000001]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -0.82} {getData=[-Infinity, -0.8180000000000001], getDataRef=[-Infinity, -0.8180000000000001], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true...#214#1630323487", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.7619999999999998"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -0.2380000000000002]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -0.24} {getData=[-Infinity, -0.2380000000000002], getDataRef=[-Infinity, -0.2380000000000002], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true...#214#1045328247", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.07619999999999998"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getSubVector", "int,int", "-2147483648", "2147483647"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -0.9238000000000001]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -0.92} {getData=[-Infinity, -0.9238000000000001], getDataRef=[-Infinity, -0.9238000000000001], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true...#214#-1027292224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"-0.32380000000000003"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getSubVector", "int,int", "-2147483648", "2147483647"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.3238]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1.32} {getData=[-Infinity, -1.3238], getDataRef=[-Infinity, -1.3238], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.32380000000000003"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getSubVector", "int,int", "-2147483648", "2147483647"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -0.6761999999999999]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -0.68} {getData=[-Infinity, -0.6761999999999999], getDataRef=[-Infinity, -0.6761999999999999], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true...#214#1811893911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.043800000000000006"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getSubVector", "int,int", "-2147483648", "2147483647"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -0.9561999999999999]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -0.96} {getData=[-Infinity, -0.9561999999999999], getDataRef=[-Infinity, -0.9561999999999999], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true...#214#-1691388868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.0888"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getSubVector", "int,int", "-2147483648", "2147483647"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -0.9112]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -0.91} {getData=[-Infinity, -0.9112], getDataRef=[-Infinity, -0.9112], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"0.1776"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getSubVector", "int,int", "-2147483648", "2147483647"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -0.8224]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -0.82} {getData=[-Infinity, -0.8224], getDataRef=[-Infinity, -0.8224], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"5.6776"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getSubVector", "int,int", "-2147483648", "2147483647"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", "double", "8.7722226955807066E17"}}), new String[][]{{"getData", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, 4.6776]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); 4.68} {getData=[-Infinity, 4.6776], getDataRef=[-Infinity, 4.6776], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "checkIndex", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCbrtToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCbrtToSelf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCbrtToSelf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}}), new String[][]{{"mapCos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.5403023058681398, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCbrtToSelf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:3>"}}), new String[][]{{"mapCos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "0.18000000000000002"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); 1} {getData=[Infinity, 1.0], getDataRef=[Infinity, 1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); 1} {getData=[Infinity, 1.0], getDataRef=[Infinity, 1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "double[]", "<empty>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; 1; 1} {getData=[1.0, 1.0, 1.0], getDataRef=[1.0, 1.0, 1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; 1; 1} {getData=[1.0, 1.0, 1.0], getDataRef=[1.0, 1.0, 1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "double[]", "<empty>"}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "8772222695580707260"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "double[]", "<empty>"}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "4.3861113477903534E18"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "toString", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getData=[1.0, Infinity, -Infinity], getDataRef=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, is...#210#1100100154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "double[]", "<empty>"}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "4.3861113477903534E18"}}), new String[][]{{"mapAtanToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0.79; 1.57} {getData=[0.7853981633974483, 1.5707963267948966], getDataRef=[0.7853981633974483, 1.5707963267948966], getDimension=2, getL1Norm=2.356194490192345, getLInfNorm=1.5707963267948966, getNor...#252#1683930096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.79; 1.57} {getData=[0.7853981633974483, 1.5707963267948966], getDataRef=[0.7853981633974483, 1.5707963267948966], getDimension=2, getL1Norm=2.356194490192345, getLInfNorm=1.5707963267948966, getNor...#252#1683930096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "double[]", "<empty>"}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "4.3861113477903534E18"}}), new String[][]{{"mapAtanToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.57; 1.57; 0.79; 1.57} {getData=[1.5707963267948966, 1.5707963267948966, 0.7853981633974483,.., getDataRef=[1.5707963267948966, 1.5707963267948966, 0.7853981633974483,.., getDimension=4, getL1Norm=5...#307#-32350444", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.57; 1.57; 0.79; 1.57} {getData=[1.5707963267948966, 1.5707963267948966, 0.7853981633974483,.., getDataRef=[1.5707963267948966, 1.5707963267948966, 0.7853981633974483,.., getDimension=4, getL1Norm=5...#307#-32350444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "double[]", "<empty>"}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "4.3861113477903534E18"}}), new String[][]{{"mapAtanToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.57} {getData=[1.5707963267948966], getDataRef=[1.5707963267948966], getDimension=1, getL1Norm=1.5707963267948966, getLInfNorm=1.5707963267948966, getNorm=1.5707963267948966, isInfinite=false, isNaN...#207#384688965", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.57} {getData=[1.5707963267948966], getDataRef=[1.5707963267948966], getDimension=1, getL1Norm=1.5707963267948966, getLInfNorm=1.5707963267948966, getNorm=1.5707963267948966, isInfinite=false, isNaN...#207#384688965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "double[]", "<null>"}, {"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "4.3861113477903534E18"}}), new String[][]{{"mapAtanToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0.79; 0.79; 0.79; 0.79; 0.79; 0.79; 0.79} {getData=[0.7853981633974483, 0.7853981633974483, 0.7853981633974483,.., getDataRef=[0.7853981633974483, 0.7853981633974483, 0.7853981633974483,.., getDimens...#326#-1492709619", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.79; 0.79; 0.79; 0.79; 0.79; 0.79; 0.79} {getData=[0.7853981633974483, 0.7853981633974483, 0.7853981633974483,.., getDataRef=[0.7853981633974483, 0.7853981633974483, 0.7853981633974483,.., getDimens...#326#-1492709619", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "8772222695580707260"}}), new String[][]{{"mapAtanToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.57; 1.57} {getData=[1.5707963267948966, 1.5707963267948966], getDataRef=[1.5707963267948966, 1.5707963267948966], getDimension=2, getL1Norm=3.141592653589793, getLInfNorm=1.5707963267948966, getNor...#251#729904253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.57; 1.57} {getData=[1.5707963267948966, 1.5707963267948966], getDataRef=[1.5707963267948966, 1.5707963267948966], getDimension=2, getL1Norm=3.141592653589793, getLInfNorm=1.5707963267948966, getNor...#251#729904253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "8772222695580707260"}}), new String[][]{{"mapAtanToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57} {getData=[1.5707963267948966, 1.5707963267948966, 1.5707963267948966,.., getDataRef=[1.5707963267948966, 1.5707963267948966, 1....#356#-1459355742", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57; 1.57} {getData=[1.5707963267948966, 1.5707963267948966, 1.5707963267948966,.., getDataRef=[1.5707963267948966, 1.5707963267948966, 1....#356#-1459355742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false), new String[][]{{"mapAtanToSelf", "", "7"}, {"mapAcos", "", "2"}, {"getDistance", "org.apache.commons.math.linear.RealVector", "2"}, {"append", "org.apache.commons.math.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCeil", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapCosToSelf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.6209069176044193", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.5403023058681398, 0.5403023058681398, 0.5403023058681398], getDimension=3, getL1Norm=1.6209069176044193, getLInfNorm=0.5403023058681398, getNorm=0.9358310452102381, getSparcity=1.0, isInfi...#224#582806513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.7976931348623157E308, 1.7976931348623157E308, 1.797693134.., getDimension=3, getL1Norm=Infinity, getLInfNorm=1.7976931348623157E308, getNorm=Infinity, getSparcity=1.0, isInfinite=false, is...#210#840886775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapInvToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.7976931348623157E308, 1.7976931348623157E308, 1.797693134.., getDimension=3, getL1Norm=Infinity, getLInfNorm=1.7976931348623157E308, getNorm=Infinity, getSparcity=1.0, isInfinite=false, is...#210#840886775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.7976931348623157E308, 1.7976931348623157E308, 1.797693134.., getDimension=3, getL1Norm=Infinity, getLInfNorm=1.7976931348623157E308, getNorm=Infinity, getSparcity=1.0, isInfinite=false, is...#210#840886775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAdd", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapLog1p", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSqrtToSelf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapInvToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanh", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCeil", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapMultiply", new String[]{"double"}, new String[]{"8772222695580707260"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"-1.0"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCosToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, Infinity, Infinity, Infinity, Infinity, Infinity,.., getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, Infinity, Infinity, Infinity, Infinity, Infinity,.., getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"-2.000000000000001"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCosToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"-2.000000000000001"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCosToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapFloorToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPow", new String[]{"double"}, new String[]{"-0.01175"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "1", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapCos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPow", new String[]{"double"}, new String[]{"2.1005875"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "1", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapCos", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPow", new String[]{"double"}, new String[]{"61.05029375"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "-67108863", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapCos", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPow", new String[]{"double"}, new String[]{"12.21005875"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "-67108863", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); -0.84} {getData=[NaN, -0.8414709848078965], getDataRef=[NaN, -0.8414709848078965], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
