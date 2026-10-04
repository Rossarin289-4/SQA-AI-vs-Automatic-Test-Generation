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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getEntry", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "projection", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "projection", new String[]{"double[]"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "set", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1} {getData=[-1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1694978236", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparcity", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "unitize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapCeilToSelf", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0; (NaN)} {getData=[0.0, NaN], getDataRef=[0.0, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getDataRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapPow", "double", "8772222695580707260"}}), new String[][]{{"mapCbrt", "", "3"}, {"getDistance", "double[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSinhToSelf", ""}}), new String[][]{{"getL1Norm", "", "6"}, {"dotProduct", "org.apache.commons.math.linear.OpenMapRealVector", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "add", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-0; (-Infinity)} {getData=[-0.0, -Infinity], getDataRef=[-0.0, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, -1.0], getDimension=2, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, getSparcity=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"-1.5600000000000003"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAdd", "double", "1.0E-12"}}), new String[][]{{"getL1Norm", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, 0.5600000000000003], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "setSubVector", new String[]{"int", "double[]"}, new String[]{"1073741823", "<empty>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTan", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapExp", ""}}, 3), new String[][]{{"mapAtan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRint", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"mapCeil", "", "7"}, {"mapCos", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); 0.54} {getData=[NaN, 0.5403023058681398], getDataRef=[NaN, 0.5403023058681398], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}}), new String[][]{{"mapAtanToSelf", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparcity", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "1", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapInvToSelf", ""}}), new String[][]{{"getSubVector", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "unitize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getNorm", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,double[]", "0", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapFloorToSelf", ""}}), new String[][]{{"getL1Distance", "org.apache.commons.math.linear.RealVector", "3"}, {"mapCosh", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "subtract", new String[]{"org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "subtract", "org.apache.commons.math.linear.ArrayRealVector", "<sample:2>"}, {"org.apache.commons.math.linear.ArrayRealVector", "setEntry", "int,double", "-58", "-52.5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "subtract", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "hashCode", ""}}), new String[][]{{"getEntry", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "toArray", ""}}, 2), new String[][]{{"append", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAsin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "org.apache.commons.math.linear.RealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"double[]"}, new String[]{"<empty>"}, false, 6, new String[][]{}), new String[][]{{"mapFloorToSelf", "", "0"}, {"ebeMultiply", "org.apache.commons.math.linear.ArrayRealVector", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); (-Infinity)} {getData=[-Infinity, -Infinity], getDataRef=[-Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", ""}}), new String[][]{{"hasNext", "", "6"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "unitVector", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapLog10ToSelf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapExpToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "getDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0.43; (Infinity); (-Infinity)} {getData=[0.4342944819032518, Infinity, -Infinity], getDataRef=[0.4342944819032518, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getN...#243#684162436", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.43; (Infinity); (-Infinity)} {getData=[0.4342944819032518, Infinity, -Infinity], getDataRef=[0.4342944819032518, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getN...#243#684162436", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "append", "double[]", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapFloor", ""}}), new String[][]{{"mapExpm1ToSelf", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.72; (Infinity); -1; (Infinity); (Infinity); (Infinity); (Infinity); (Infinity); (Infinity)} {getData=[1.718281828459045, Infinity, -1.0, Infinity, Infinity, Infi.., getDataRef=[1.718281828459045, I...#348#768955081", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getData=[1.0, Infinity, -Infinity], getDataRef=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, is...#210#1100100154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "unitVector", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "add", "org.apache.commons.math.linear.RealVector", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; (NaN)} {getData=[0.0, NaN], getDataRef=[0.0, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAbs", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAcosToSelf", ""}}), new String[][]{{"append", "org.apache.commons.math.linear.RealVector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0; (NaN)} {getData=[NaN, NaN, 4.440892098500626E-16, NaN], getDataRef=[NaN, NaN, 4.440892098500626E-16, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=fal...#215#490275875", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); 0; (NaN)} {getData=[NaN, NaN, 4.440892098500626E-16, NaN], getDataRef=[NaN, NaN, 4.440892098500626E-16, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=fal...#215#490275875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSignumToSelf", ""}}, 2), new String[][]{{"mapDivideToSelf", "double", "5"}, {"getEntry", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "equals", "java.lang.Object", "<s:}>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; 0; 0; 0} {getData=[0.0, 0.0, 0.0, 0.0], getDataRef=[0.0, 0.0, 0.0, 0.0], getDimension=4, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0; 0; 0; 0} {getData=[0.0, 0.0, 0.0, 0.0], getDataRef=[0.0, 0.0, 0.0, 0.0], getDimension=4, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapLogToSelf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSqrtToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:5>"}}, 3), new String[][]{{"getLInfNorm", "", "2"}, {"getSubVector", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.RealVector", "<sample:3>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<null>"}}, 3), new String[][]{{"add", "org.apache.commons.math.linear.RealVector", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTan", new String[]{}, new String[]{}, false), new String[][]{{"getLInfDistance", "org.apache.commons.math.linear.RealVector", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCoshToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapUlp", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.54; 1.54; 1.54} {getData=[1.543080634815244, 1.543080634815244, 1.543080634815244], getDataRef=[1.543080634815244, 1.543080634815244, 1.543080634815244], getDimension=3, getL1Norm=4.629241904445732...#290#-1115577223", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.54; 1.54; 1.54} {getData=[1.543080634815244, 1.543080634815244, 1.543080634815244], getDataRef=[1.543080634815244, 1.543080634815244, 1.543080634815244], getDimension=3, getL1Norm=4.629241904445732...#290#-1115577223", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapCoshToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); (-Infinity)} {getData=[-Infinity, -Infinity], getDataRef=[-Infinity, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); 1.54} {getData=[Infinity, 1.543080634815244], getDataRef=[Infinity, 1.543080634815244], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=...#206#1083899685", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAsinToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "dotProduct", "org.apache.commons.math.linear.ArrayRealVector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-2147479589", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "set", new String[]{"int", "org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"0", "<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "outerProduct", "double[]", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "add", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:7>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapRint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSqrtToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<empty>"}}), new String[][]{{"add", "org.apache.commons.math.linear.OpenMapRealVector", "1"}, {"mapCbrtToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, NaN, -Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "double[]"}, new String[]{"2147483647", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "double[]", "<sample:5>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}), new String[][]{{"mapAtanToSelf", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, 0.0], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.5, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "add", new String[]{"org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); (Infinity)} {getData=[-Infinity, Infinity], getDataRef=[-Infinity, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAcosToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getSubVector", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapUlp", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "5.3400000000001"}, {"org.apache.commons.math.linear.OpenMapRealVector", "add", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:7>"}}), new String[][]{{"getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-6.3400000000001, -6.3400000000001, -6.3400000000001], getDimension=3, getL1Norm=19.0200000000003, getLInfNorm=6.3400000000001, getNorm=10.981202119986856, getSparcity=1.0, isInfinite=false,...#213#580678172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"-4.0"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapFloorToSelf", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "double[]", "<sample:4>"}}), new String[][]{{"getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, 3.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCeil", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSignumToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "append", "double", "8.7722226955807058E18"}}), new String[][]{{"mapAbs", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; 1; 1; 1} {getData=[1.0, 1.0, 1.0, 1.0], getDataRef=[1.0, 1.0, 1.0, 1.0], getDimension=4, getL1Norm=4.0, getLInfNorm=1.0, getNorm=2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; -1; -1; -1} {getData=[1.0, -1.0, -1.0, -1.0], getDataRef=[1.0, -1.0, -1.0, -1.0], getDimension=4, getL1Norm=4.0, getLInfNorm=1.0, getNorm=2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcosToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapInv", ""}}), new String[][]{{"getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "1"}, {"append", "org.apache.commons.math.linear.RealVector", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapExpm1ToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getSubVector", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-0.6321205588285577], getDimension=1, getL1Norm=0.6321205588285577, getLInfNorm=0.6321205588285577, getNorm=0.6321205588285577, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-0.6321205588285577, -0.6321205588285577, -0.63212055882855.., getDimension=3, getL1Norm=1.896361676485673, getLInfNorm=0.6321205588285577, getNorm=1.0948649243998934, getSparcity=1.0, isInf...#225#-219971722", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:8>"}, {"org.apache.commons.math.linear.ArrayRealVector", "outerProduct", "org.apache.commons.math.linear.RealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -1.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1} {getData=[-1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapLogToSelf", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "org.apache.commons.math.linear.RealVector", "<sample:9>"}}), new String[][]{{"getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapUlp", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "set", "double", "16.0"}, {"org.apache.commons.math.linear.OpenMapRealVector", "getDimension", ""}}, 2), new String[][]{{"getLInfDistance", "org.apache.commons.math.linear.RealVector", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[16.0], getDimension=1, getL1Norm=16.0, getLInfNorm=16.0, getNorm=16.0, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapUlpToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:5>"}}), new String[][]{{"getDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0; (Infinity)} {getData=[2.220446049250313E-16, Infinity], getDataRef=[2.220446049250313E-16, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, i...#211#-264484913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "outerProduct", new String[]{"org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAdd", "double", "2.67000000000005"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.Array2DRowRealMatrix", actual.getClass().getName());
  assertEquals("Array2DRowRealMatrix{{Infinity,-Infinity,-Infinity,-Infinity},{-Infinity,Infinity,Infinity,Infinity},{-Infinity,Infinity,1.0,Infinity},{-Infinity,Infinity,Infinity,Infinity}} {getColumnDimension=4, ge...#480#-1990497827", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"-5.4898067035540198E17"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:8>"}}), new String[][]{{"mapAbsToSelf", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{548,980,670,355,401,980; 548,980,670,355,401,980; 548,980,670,355,401,980} {getData=[5.4898067035540198E17, 5.4898067035540198E17, 5.48980670355.., getDataRef=[5.4898067035540198E17, 5.48980670355401...#369#-1894111595", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{548,980,670,355,401,980; 548,980,670,355,401,980; 548,980,670,355,401,980} {getData=[5.4898067035540198E17, 5.4898067035540198E17, 5.48980670355.., getDataRef=[5.4898067035540198E17, 5.48980670355401...#369#-1894111595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "projection", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "append", "org.apache.commons.math.linear.ArrayRealVector", "<sample:9>"}}), new String[][]{{"append", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-0; 0; 0; (Infinity)} {getData=[-0.0, 0.0, 0.0, Infinity], getDataRef=[-0.0, 0.0, 0.0, Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=fa...#204#1915532960", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1} {getData=[-1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapLog1pToSelf", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapLog", ""}}), new String[][]{{"mapDivide", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (NaN); (NaN)} {getData=[Infinity, NaN, NaN], getDataRef=[Infinity, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.69; (Infinity); (NaN)} {getData=[0.6931471805599453, Infinity, NaN], getDataRef=[0.6931471805599453, Infinity, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, i...#210#669502881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:6>"}}), new String[][]{{"ebeMultiply", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, NaN, -1.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "setSubVector", new String[]{"int", "org.apache.commons.math.linear.RealVector"}, new String[]{"-149", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.18; (Infinity); (-Infinity)} {getData=[1.1752011936438014, Infinity, -Infinity], getDataRef=[1.1752011936438014, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getN...#243#-1260393955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "projection", "org.apache.commons.math.linear.RealVector", "<sample:3>"}}, 3), new String[][]{{"mapAsin", "", "7"}, {"getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "3"}, {"getDistance", "org.apache.commons.math.linear.RealVector", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCbrt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCeil", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapPow", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCoshToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "add", "org.apache.commons.math.linear.ArrayRealVector", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCoshToSelf", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "isNaN", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727111", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "unitize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "ebeMultiply", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbs", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "add", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (Infinity); 1; (Infinity)} {getData=[Infinity, Infinity, 1.0, Infinity], getDataRef=[Infinity, Infinity, 1.0, Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=...#239#-1172591986", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"double[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", "double", "NaN"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapExpm1", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getNorm", ""}}, 1), new String[][]{{"ebeDivide", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1.72; (NaN)} {getData=[1.718281828459045, NaN], getDataRef=[1.718281828459045, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCoshToSelf", ""}}, 2), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkIndex", "int", "-1"}, {"org.apache.commons.math.linear.ArrayRealVector", "subtract", "org.apache.commons.math.linear.ArrayRealVector", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; (Infinity); (-Infinity); -1} {getData=[1.0, Infinity, -Infinity, -1.0], getDataRef=[1.0, Infinity, -Infinity, -1.0], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isI...#226#1965580944", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<null>"}}, 1), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanhToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "equals", "java.lang.Object", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0.76; 1} {getData=[0.7615941559557649, 1.0], getDataRef=[0.7615941559557649, 1.0], getDimension=2, getL1Norm=1.7615941559557649, getLInfNorm=1.0, getNorm=1.2569907153141482, isInfinite=false, isNaN=f...#205#625908807", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.76; 1} {getData=[0.7615941559557649, 1.0], getDataRef=[0.7615941559557649, 1.0], getDimension=2, getL1Norm=1.7615941559557649, getLInfNorm=1.0, getNorm=1.2569907153141482, isInfinite=false, isNaN=f...#205#625908807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapPow", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapPowToSelf", "double", "-9.999999999999998E-13"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Distance", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapTanhToSelf", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.761594155955764", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.76; 1; -1} {getData=[0.7615941559557649, 1.0, -1.0], getDataRef=[0.7615941559557649, 1.0, -1.0], getDimension=3, getL1Norm=2.761594155955765, getLInfNorm=1.0, getNorm=1.6062458275077243, isInfinite...#220#-863120953", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double[]", "<empty>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", "double[]", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "checkIndex", new String[]{"int"}, new String[]{"-16777215"}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSubtractToSelf", "double", "1.9999999999999998"}, {"org.apache.commons.math.linear.ArrayRealVector", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"-1.754444539116141E19"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<i:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanToSelf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:6>"}}, 3), new String[][]{{"mapExpToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0], getDimension=1, getL1Norm=1.0, getLInfNorm=1.0, getNorm=1.0, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSignumToSelf", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "subtract", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSin", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getSubVector", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapPow", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapLog1p", ""}}, 3), new String[][]{{"mapExp", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSignum", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapCeil", ""}}, 1), new String[][]{{"mapCeilToSelf", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; 1} {getData=[1.0, 1.0], getDataRef=[1.0, 1.0], getDimension=2, getL1Norm=2.0, getLInfNorm=1.0, getNorm=1.4142135623730951, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSqrtToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapTan", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "copy", ""}}, 2), new String[][]{{"mapAcos", "", "0"}, {"mapExpm1ToSelf", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(NaN)} {getData=[NaN], getDataRef=[NaN], getDimension=1, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAtan", ""}}, 2), new String[][]{{"getEntry", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSinToSelf", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, -0.8414709848078965], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, -0.8414709848078965], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3), new String[][]{{"append", "double[]", "7"}, {"mapExpm1", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.718281828459045, 1.718281828459045, 1.718281828459045, 1..., getDimension=5, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, 1.0, 1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "set", new String[]{"int", "org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"-1073741824", "<sample:5>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"double"}, new String[]{"-8.772222695580706E19"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-87,722,226,955,807,060,000} {getData=[-8.772222695580706E19], getDataRef=[-8.772222695580706E19], getDimension=1, getL1Norm=8.772222695580706E19, getLInfNorm=8.772222695580706E19, getNorm=8.77222269...#242#-772950687", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getData", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapRintToSelf", ""}}, 2), new String[][]{{"getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, null, 1), new String[][]{{"append", "double[]", "7"}, {"mapDivideToSelf", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.ArrayRealVector"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "setSubVector", "int,double[]", "-2147483648", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", new String[]{"double"}, new String[]{"-11.0"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapUlp", ""}, {"org.apache.commons.math.linear.ArrayRealVector", "mapTan", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSqrtToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getLInfNorm", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}, 3), new String[][]{{"getSubVector", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCeil", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}, 3), new String[][]{{"mapExpm1ToSelf", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-0.63; -0.63; -0.63} {getData=[-0.6321205588285577, -0.6321205588285577, -0.63212055882855.., getDataRef=[-0.6321205588285577, -0.6321205588285577, -0.63212055882855.., getDimension=3, getL1Norm=1.89...#305#412804569", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1} {getData=[-1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSqrtToSelf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiplyToSelf", "double", "-3.1200000000000006"}}, 2), new String[][]{{"mapExpm1ToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, Infinity], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"1.5600000000000003"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "unitVector", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapPow", "double", "2.0"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "1.09796134071080397E18"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "set", new String[]{"double"}, new String[]{"1.5600000000000003"}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapTanh", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.56; 1.56} {getData=[1.5600000000000003, 1.5600000000000003], getDataRef=[1.5600000000000003, 1.5600000000000003], getDimension=2, getL1Norm=3.1200000000000006, getLInfNorm=1.5600000000000003, getNo...#253#-866465888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "toArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"2.19592268142160794E18"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "dotProduct", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "checkIndex", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "-16361", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPow", new String[]{"double"}, new String[]{"-1.9999999999999996E-12"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.5, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapInv", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "projection", "org.apache.commons.math.linear.RealVector", "<sample:9>"}}, 2), new String[][]{{"mapAtanToSelf", "", "3"}, {"mapAtanToSelf", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-0.67; -0.67; -0.67; 1; 1; 1; 1; 1; 1} {getData=[-0.6657737500283538, -0.6657737500283538, -0.66577375002835.., getDataRef=[-0.6657737500283538, -0.6657737500283538, -0.66577375002835.., getDimension...#322#-612364181", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1} {getData=[-1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getSubVector", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "double[]"}, new String[]{"-1073741823", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "double", "-1.7544445391161412E19"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapMultiplyToSelf", new String[]{"double"}, new String[]{"52.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapRint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.RealVector", "<sample:4>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "double[]", "<sample:5>"}}, 2), new String[][]{{"mapCos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.5403023058681398, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-0.8414709848078965, -0.8414709848078965, -0.84147098480789.., getDimension=3, getL1Norm=2.5244129544236893, getLInfNorm=0.8414709848078965, getNorm=1.4574704987822957, getSparcity=1.0, isIn...#226#1943860173", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPow", new String[]{"double"}, new String[]{"8.7722226955807058E18"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSinToSelf", ""}}, 1), new String[][]{{"append", "double[]", "2"}, {"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[0.8414709848078965, NaN, NaN], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanToSelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getSparcity", ""}}, 3), new String[][]{{"isInfinite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:1>"}, {"org.apache.commons.math.linear.ArrayRealVector", "append", "double", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSignumToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=2.0, getLInfNorm=1.0, getNorm=1.4142135623730951, getSparcity=0.25, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=2.0, getLInfNorm=1.0, getNorm=1.4142135623730951, getSparcity=0.25, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCbrtToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAsin", ""}}, 1), new String[][]{{"append", "org.apache.commons.math.linear.OpenMapRealVector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapInv", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", "double", "-0.2"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDimension", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:9>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapExpm1ToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getNorm", ""}}, 2), new String[][]{{"mapCbrt", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanhToSelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", "double", "-26.250000000000004"}}, 2), new String[][]{{"append", "double", "2"}, {"dotProduct", "org.apache.commons.math.linear.OpenMapRealVector", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getDimension", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapTanhToSelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; -1; -0.76; -1} {getData=[1.0, -1.0, -0.7615941559557649, -1.0], getDataRef=[1.0, -1.0, -0.7615941559557649, -1.0], getDimension=4, getL1Norm=3.761594155955765, getLInfNorm=1.0, getNorm=1.892095573...#238#-1537954227", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "double[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setEntry", new String[]{"int", "double"}, new String[]{"-1073741824", "-1097961340710804027"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCbrtToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "setEntry", "int,double", "2147483647", "8.7722226955807058E18"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.AbstractRealVector$SparseEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getData=[1.0, Infinity, -Infinity], getDataRef=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, is...#210#1100100154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapInv", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", "org.apache.commons.math.analysis.UnivariateRealFunction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getNorm", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapDivideToSelf", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAddToSelf", new String[]{"double"}, new String[]{"2.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (-Infinity); 1; (-Infinity)} {getData=[Infinity, -Infinity, 1.0, -Infinity], getDataRef=[Infinity, -Infinity, 1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, ge...#245#-1816479616", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); 1; (-Infinity)} {getData=[Infinity, -Infinity, 1.0, -Infinity], getDataRef=[Infinity, -Infinity, 1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity, ge...#245#-1816479616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapFloor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapLog1pToSelf", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, -Infinity], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, -Infinity], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAtanToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isDefaultValue", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapFloorToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCbrtToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"double"}, new String[]{"47.99999999999999"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{48} {getData=[47.99999999999999], getDataRef=[47.99999999999999], getDimension=1, getL1Norm=47.99999999999999, getLInfNorm=47.99999999999999, getNorm=47.99999999999999, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getEntry", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapExpToSelf", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[2.718281828459045, Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[2.718281828459045, Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapExpToSelf", new String[]{}, new String[]{}, false), new String[][]{{"mapExpToSelf", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinh", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapExpm1", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTan", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapInv", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:9>"}}), new String[][]{{"getNorm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "set", new String[]{"double"}, new String[]{"1.9999999999999996E-12"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.9999999999999996E-12, 1.9999999999999996E-12, 1.999999999.., getDimension=3, getL1Norm=5.999999999999999E-12, getLInfNorm=1.9999999999999996E-12, getNorm=3.464101615137754E-12, getSparcity...#236#-1127012176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", new String[]{"double"}, new String[]{"-1097961340710804027"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, Infinity, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivide", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "sparseIterator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapUlp", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCbrtToSelf", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isNaN", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCeil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAtan", ""}}), new String[][]{{"mapAddToSelf", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparcity", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6666666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSignum", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSubVector", new String[]{"int", "int"}, new String[]{"-9", "-54"}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkIndex", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapTanToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getL1Distance", "org.apache.commons.math.linear.RealVector", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDimension", ""}}), new String[][]{{"hasNext", "", "5"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.AbstractRealVector$EntryImpl", actual.getClass().getName());
  assertEquals("{getIndex=0, getValue=!MatrixIndexException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapUlp", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSinToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapInv", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, 0.0], getDimension=3, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.6666666666666666, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapMultiply", new String[]{"double"}, new String[]{"1.0E-12"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanh", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[-0.7615941559557649, -0.7615941559557649, -0.76159415595576.., getDimension=3, getL1Norm=2.2847824678672946, getLInfNorm=0.7615941559557649, getNorm=1.31911977286292, getSparcity=1.0, isInfi...#224#247873871", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanh", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-1; -0.76} {getData=[-1.0, -0.7615941559557649], getDataRef=[-1.0, -0.7615941559557649], getDimension=2, getL1Norm=1.7615941559557649, getLInfNorm=1.0, getNorm=1.2569907153141482, isInfinite=false, i...#211#128726941", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(-Infinity); -1} {getData=[-Infinity, -1.0], getDataRef=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-49>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapMultiplyToSelf", "double", "0.0"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapSinToSelf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSubtractToSelf", new String[]{"double"}, new String[]{"1.7544445391161412E19"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCosToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapRint", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSinToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapTanToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"1.7544445391161413E20"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setEntry", new String[]{"int", "double"}, new String[]{"0", "1.9999999999999996E-12"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[1.9999999999999996E-12], getDimension=1, getL1Norm=1.9999999999999996E-12, getLInfNorm=1.9999999999999996E-12, getNorm=1.9999999999999996E-12, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapRint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapInvToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "add", "org.apache.commons.math.linear.ArrayRealVector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getLInfDistance", "org.apache.commons.math.linear.ArrayRealVector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapPowToSelf", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "append", new String[]{"org.apache.commons.math.linear.OpenMapRealVector"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getDataRef", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "add", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapUlpToSelf", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, 0.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.5, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, 0.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.5, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", new String[]{"int", "double[]"}, new String[]{"2147483647", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapCeilToSelf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getData", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSqrtToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanh", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; -1; -0.76; -1} {getData=[1.0, -1.0, -0.7615941559557649, -1.0], getDataRef=[1.0, -1.0, -0.7615941559557649, -1.0], getDimension=4, getL1Norm=3.761594155955765, getLInfNorm=1.0, getNorm=1.892095573...#238#-1537954227", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "toArray", ""}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapLog10ToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "checkIndex", new String[]{"int"}, new String[]{"-536870912"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{-1.18; -1.18; -1.18} {getData=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDataRef=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDimension=3, getL1Norm=3.52...#305#-1446244548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1.18; -1.18; -1.18} {getData=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDataRef=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDimension=3, getL1Norm=3.52...#305#-1446244548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setEntry", new String[]{"int", "double"}, new String[]{"0", "Infinity"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", new String[]{"double[]"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapExp", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAtan", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "projection", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false), new String[][]{{"mapAcos", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSubtractToSelf", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-818727111", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "map", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapAtan", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[1.0, 1.0, 1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, getSparcity=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapExpm1ToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "ebeDivide", "org.apache.commons.math.linear.ArrayRealVector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getDistance", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSignum", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAcosToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getSubVector", "int,int", "-35", "0"}, {"org.apache.commons.math.linear.ArrayRealVector", "checkIndex", "int", "10"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0; (NaN)} {getData=[0.0, NaN], getDataRef=[0.0, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0; (NaN)} {getData=[0.0, NaN], getDataRef=[0.0, NaN], getDimension=2, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}), new String[][]{{"iterator", "", "2"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "checkIndex", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSqrt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapToSelf", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAcosToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "7"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "add", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"9.999999999999998E-13"}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanhToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSqrtToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "append", "org.apache.commons.math.linear.RealVector", "<sample:2>"}}), new String[][]{{"append", "org.apache.commons.math.linear.ArrayRealVector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapLog", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[Infinity, NaN, -Infinity, -Infinity, -Infinity, -Infinity, .., getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=1.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkIndex", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getDataRef", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.1752011936438014, -1.1752011936438014, -1.1752011936438014]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1.18; -1.18; -1.18} {getData=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDataRef=[-1.1752011936438014, -1.1752011936438014, -1.17520119364380.., getDimension=3, getL1Norm=3.52...#305#-1446244548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAcos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapLog1p", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getDimension", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAdd", "double", "1.9999999999999996E-12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1; -1; -1} {getData=[-1.0, -1.0, -1.0], getDataRef=[-1.0, -1.0, -1.0], getDimension=3, getL1Norm=3.0, getLInfNorm=1.0, getNorm=1.7320508075688772, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getSparcity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapRint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCosToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapAcosToSelf", ""}}), new String[][]{{"mapAsin", "", "3"}, {"append", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{0} {getData=[0.0], getDataRef=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapUlpToSelf", new String[]{}, new String[]{}, false), new String[][]{{"getSubVector", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "append", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapTanToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTan", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getDistance", "double[]", "<sample:1>"}}), new String[][]{{"mapAcosToSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.25, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "int", "-2147483647"}}), new String[][]{{"getLInfNorm", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSqrtToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (NaN); (NaN); (NaN)} {getData=[Infinity, NaN, NaN, NaN], getDataRef=[Infinity, NaN, NaN, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (NaN); (NaN); (NaN)} {getData=[Infinity, NaN, NaN, NaN], getDataRef=[Infinity, NaN, NaN, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSinToSelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapInvToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "setEntry", new String[]{"int", "double"}, new String[]{"8421386", "9.999999999999998E-13"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "append", "double[]", "<sample:0>"}, {"org.apache.commons.math.linear.ArrayRealVector", "mapAtanToSelf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.linear.MatrixIndexException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapCeilToSelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "subtract", "org.apache.commons.math.linear.RealVector", "<sample:0>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "mapCeilToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "outerProduct", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapRintToSelf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSinhToSelf", new String[]{}, new String[]{}, false), new String[][]{{"add", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{1; (Infinity); (-Infinity)} {getData=[1.0, Infinity, -Infinity], getDataRef=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, is...#210#1100100154", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "projection", "double[]", "<sample:0>"}}), new String[][]{{"getDimension", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "isInfinite", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "append", "org.apache.commons.math.linear.OpenMapRealVector", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "copy", new String[]{}, new String[]{}, false), new String[][]{{"getDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapAbsToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapInv", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Norm", ""}}), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.25, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSignumToSelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getNorm", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTanToSelf", new String[]{}, new String[]{}, false), new String[][]{{"getL1Norm", "", "2"}, {"getL1Distance", "org.apache.commons.math.linear.OpenMapRealVector", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapTan", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "equals", "java.lang.Object", "<s:key>"}}), new String[][]{{"mapCeilToSelf", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[0.0], getDimension=1, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "setEntry", new String[]{"int", "double"}, new String[]{"1", "0.44000000000100004"}, false, 3, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeMultiply", "org.apache.commons.math.linear.RealVector", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getData=[-Infinity, 0.44000000000100004], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSubtract", new String[]{"double"}, new String[]{"1.9999999999999996E-12"}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapTanh", ""}}), new String[][]{{"getDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapSubtract", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{2; (Infinity)} {getData=[2.0, Infinity], getDataRef=[2.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity)} {getData=[1.0, Infinity], getDataRef=[1.0, Infinity], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapDivideToSelf", new String[]{"double"}, new String[]{"1.7544445391161412E19"}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "outerProduct", "org.apache.commons.math.linear.ArrayRealVector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-49>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getLInfDistance", "double[]", "<sample:5>"}}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "ebeDivide", "org.apache.commons.math.linear.RealVector", "<sample:4>"}}), new String[][]{{"hasNext", "", "1"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapLog10", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapAcosToSelf", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[NaN, NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.25, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[NaN, NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0], getDimension=8, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, getSparcity=0.25, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "getLInfNorm", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[-Infinity, -1.0], getDimension=2, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapRintToSelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "mapSinhToSelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapCeil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "checkVectorDimensions", "org.apache.commons.math.linear.RealVector", "<sample:6>"}}), new String[][]{{"getData", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {getData=[], getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapUlp", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", ""}}), new String[][]{{"mapFloor", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[0.0, Infinity, Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[1.0, Infinity, -Infinity], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapLog10", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "getL1Distance", "double[]", "<sample:2>"}, {"org.apache.commons.math.linear.OpenMapRealVector", "setSubVector", "int,org.apache.commons.math.linear.RealVector", "-1073217537", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.OpenMapRealVector", actual.getClass().getName());
  assertEquals("{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getData=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getNorm=0.0, getSparcity=NaN, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapLog1pToSelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{(Infinity); (NaN); (-Infinity); (NaN)} {getData=[Infinity, NaN, -Infinity, NaN], getDataRef=[Infinity, NaN, -Infinity, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=fa...#216#1921423448", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (NaN); (-Infinity); (NaN)} {getData=[Infinity, NaN, -Infinity, NaN], getDataRef=[Infinity, NaN, -Infinity, NaN], getDimension=4, getL1Norm=NaN, getLInfNorm=NaN, getNorm=NaN, isInfinite=fa...#216#1921423448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.OpenMapRealVector", "org.apache.commons.math.linear.OpenMapRealVector", "mapSqrt", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.OpenMapRealVector", "mapSinh", ""}}), new String[][]{{"getNorm", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getData=[Infinity, -Infinity, 0.0], getDimension=3, getL1Norm=Infinity, getLInfNorm=Infinity, getNorm=Infinity, getSparcity=0.6666666666666666, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.linear.ArrayRealVector", "org.apache.commons.math.linear.ArrayRealVector", "mapTanh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.linear.ArrayRealVector", "setEntry", "int,double", "4106", "0.0"}}), new String[][]{{"getL1Distance", "org.apache.commons.math.linear.ArrayRealVector", "7"}, {"getDataRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, -1.0, -0.7615941559557649, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(Infinity); (-Infinity); -1; (-Infinity)} {getData=[Infinity, -Infinity, -1.0, -Infinity], getDataRef=[Infinity, -Infinity, -1.0, -Infinity], getDimension=4, getL1Norm=Infinity, getLInfNorm=Infinity,...#248#878673809", SearchInputFactory_scaffolding.receiverState());
 }
}
