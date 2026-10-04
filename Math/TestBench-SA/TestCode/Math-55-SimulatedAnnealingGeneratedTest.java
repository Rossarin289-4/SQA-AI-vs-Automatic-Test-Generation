package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:8>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}, {"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}), new String[][]{{"scalarMultiply", "double", "7"}, {"normalize", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "org.apache.commons.math.geometry.Vector3D", "<sample:1>"}, {"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "org.apache.commons.math.geometry.Vector3D", "<sample:3>"}, {"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("387435958", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(Infinity); (-Infinity); (NaN)} {getAlpha=-0.7853981633974483, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=Infinity, getY=-Infinity, getZ=NaN, isInfinite=false, isNaN...#206#-640281409", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:3>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.9999", "<sample:2>"}, false, 0, null, 2), new String[][]{{"getZ", "", "2"}, {"normalize", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=-0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"1.7976931348623157E308", "<sample:5>"}, false, 0, null, 3), new String[][]{{"scalarMultiply", "double", "2"}, {"orthogonal", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.6", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "normalize", ""}, {"org.apache.commons.math.geometry.Vector3D", "add", "org.apache.commons.math.geometry.Vector3D", "<sample:1>"}}, 1), new String[][]{{"getNormInf", "", "2"}, {"orthogonal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.7; 0; 0.72} {getAlpha=3.141592653589793, getDelta=0.7988869794872516, getNorm=1.0, getNorm1=1.414084907546412, getNormInf=0.7165801978651805, getNormSq=1.0, getX=-0.6975047096812315, getY=0.0, get...#252#1493735766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.041999999999999996", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}}, 1), new String[][]{{"add", "org.apache.commons.math.geometry.Vector3D", "6"}, {"getY", "", "6"}, {"getDelta", "", "5"}, {"subtract", "org.apache.commons.math.geometry.Vector3D", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"Infinity", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}}), new String[][]{{"isInfinite", "", "5"}, {"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:6>"}, true), new String[][]{{"getDelta", "", "1"}, {"getNormSq", "", "5"}, {"orthogonal", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.6", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.6", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.86; -1.35; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.5999999999999999, getNorm1=2.2108372650816577, getNormInf=1.3463535756926344, getNormSq=2.5599999999999996, getX=0.8644836893890235, getY=-1.34...#256#249486960", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.6", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "org.apache.commons.math.geometry.Vector3D", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.86; -1.35; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.5999999999999999, getNorm1=2.2108372650816577, getNormInf=1.3463535756926344, getNormSq=2.5599999999999996, getX=0.8644836893890235, getY=-1.34...#256#249486960", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.6", "<sample:8>"}, false, 1, new String[][]{}, 3), new String[][]{{"subtract", "org.apache.commons.math.geometry.Vector3D", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:6>"}, {"org.apache.commons.math.geometry.Vector3D", "scalarMultiply", "double", "2.2250738585072014E-308"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.46; (-Infinity); (Infinity)} {getAlpha=-1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=-0.45969769413186023, getY=-Infinity, g...#243#-599001142", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{0.54; -0.84; 0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"45.190990000000006"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}, {"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}}, 2), new String[][]{{"scalarMultiply", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; -0; 0} {getAlpha=-0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=-0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"232.1", "<sample:10>"}, false, 0, null, 2), new String[][]{{"normalize", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}, {"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "-0.009010000000000025", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "-0.009010000000000025", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "-0.009010000000000025", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5403023058681398", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "256.0", "<sample:3>"}, {"org.apache.commons.math.geometry.Vector3D", "isInfinite", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "256.0", "<sample:4>"}, {"org.apache.commons.math.geometry.Vector3D", "isInfinite", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{1; (Infinity); (-Infinity)}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"3.141592653589793"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{1.7; -2.64; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=3.141592653589793, getNorm1=4.340968818914429, getNormInf=2.643559064081456, getNormSq=9.869604401089358, getX=1.6974097548329732, getY=-2.6435590...#250#-1421040769", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"0.31415926535897937"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.17; -0.26; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=0.31415926535897937, getNorm1=0.434096881891443, getNormInf=0.26435590640814566, getNormSq=0.09869604401089363, getX=0.16974097548329736, getY=-0...#260#-1634182714", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.6", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"256.0", "<sample:5>"}, false, 0, null, 2), new String[][]{{"add", "org.apache.commons.math.geometry.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"255.99999999999997", "<sample:5>"}, false, 0, null, 2), new String[][]{{"add", "org.apache.commons.math.geometry.Vector3D", "4"}, {"getNorm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"28.99099", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "scalarMultiply", "double", "-0.009010000000000025"}, {"org.apache.commons.math.geometry.Vector3D", "normalize", ""}}, 2), new String[][]{{"add", "org.apache.commons.math.geometry.Vector3D", "4"}, {"getX", "", "5"}, {"isInfinite", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "0.6", "<null>"}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "0.6", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "0.6", "<null>"}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "0.6", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getY", "", "2"}, {"add", "org.apache.commons.math.geometry.Vector3D", "4"}, {"subtract", "double,org.apache.commons.math.geometry.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getY", "", "2"}, {"add", "org.apache.commons.math.geometry.Vector3D", "5"}, {"subtract", "double,org.apache.commons.math.geometry.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"add", "double,org.apache.commons.math.geometry.Vector3D", "4"}, {"subtract", "org.apache.commons.math.geometry.Vector3D", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:11>", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-1.0", "<sample:1>"}, false, 6, new String[][]{}, 3), new String[][]{{"getNormSq", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"1.025", "<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}}, 3), new String[][]{{"getNormSq", "", "0"}, {"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"1.025", "<null>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.8414709848078965", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}, {"org.apache.commons.math.geometry.Vector3D", "getY", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.8414709848078965", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}, {"org.apache.commons.math.geometry.Vector3D", "getY", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm1", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3817732906760363", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm1", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-0.009010000000000025", "<sample:4>"}, false, 0, null, 1), new String[][]{{"subtract", "org.apache.commons.math.geometry.Vector3D", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "0.9999", "<sample:7>"}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "253.6", "<sample:8>"}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "1.9998", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}, {"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2147483624>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"scalarMultiply", "double", "7"}, {"getAlpha", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm1", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "normalize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm1", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "normalize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5403023058681398", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8414709848078965", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}, {"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("387435958", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:8>"}, false, 10, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "getX", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.8414709848078965", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{0.54; -0.84; 0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{1; (Infinity); (-Infinity)}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{97,129,774,600,943,380,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,...#1050#-1126675066", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"256.0"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{138.32; -215.42; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=256.0, getNorm1=353.7339624130653, getNormInf=215.4165721108215, getNormSq=65536.0, getX=138.31739030224378, getY=-215.4165721108215, getZ=0....#233#-113864095", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"256.0"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}), new String[][]{{"scalarMultiply", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; -0; 0} {getAlpha=-0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=-0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"256.04799999999994"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}), new String[][]{{"scalarMultiply", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}, {"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}), new String[][]{{"scalarMultiply", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0; 0; -0} {getAlpha=3.141592653589793, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=-0.0, getY=0.0, getZ=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}, {"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}), new String[][]{{"scalarMultiply", "double", "7"}, {"normalize", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"-0.009010000000000025"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "NaN", "<sample:6>"}, {"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}}), new String[][]{{"scalarMultiply", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0; 0; -0} {getAlpha=3.141592653589793, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=-0.0, getY=0.0, getZ=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"subtract", "double,org.apache.commons.math.geometry.Vector3D", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"subtract", "double,org.apache.commons.math.geometry.Vector3D", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}, {"org.apache.commons.math.geometry.Vector3D", "negate", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 1} {getAlpha=0.0, getDelta=1.5707963267948966, getNorm=1.0, getNorm1=1.0, getNormInf=1.0, getNormSq=1.0, getX=0.0, getY=0.0, getZ=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-1.0", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-1.0", "<sample:4>"}, false), new String[][]{{"getX", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"115.44", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"1.7976931348623157E308", "<sample:3>"}, false), new String[][]{{"scalarMultiply", "double", "7"}, {"add", "org.apache.commons.math.geometry.Vector3D", "7"}, {"getX", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-Infinity", "<sample:2>"}, false, 7, new String[][]{}), new String[][]{{"scalarMultiply", "double", "1"}, {"add", "org.apache.commons.math.geometry.Vector3D", "7"}, {"getX", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{1.08; -1.68; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=2.0, getNorm1=2.7635465813520725, getNormInf=1.682941969615793, getNormSq=4.0, getX=1.0806046117362795, getY=-1.682941969615793, getZ=0.0, isInfi...#224#-503443366", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{1.54; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.5403023058681398, getY=Infinity, getZ=-...#239#1974054414", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"0.6"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "1.0", "<sample:6>"}, {"org.apache.commons.math.geometry.Vector3D", "scalarMultiply", "double", "2.2250738585072014E-308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.32; -0.5; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=0.6, getNorm1=0.8290639744056216, getNormInf=0.5048825908847379, getNormSq=0.36, getX=0.3241813835208838, getY=-0.5048825908847379, getZ=0.0, isIn...#226#660998401", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm1", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3817732906760363", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm1", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm1", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5403023058681398", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}, {"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "-0.009010000000000025", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5403023058681398", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>"}, false), new String[][]{{"isInfinite", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8414709848078965", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"3.141592653589793"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{1.7; -2.64; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=3.141592653589793, getNorm1=4.340968818914429, getNormInf=2.643559064081456, getNormSq=9.869604401089358, getX=1.6974097548329732, getY=-2.6435590...#250#-1421040769", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "getY", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "getY", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "getY", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"256.0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"256.0", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"28.99099", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "scalarMultiply", "double", "-0.009010000000000025"}, {"org.apache.commons.math.geometry.Vector3D", "normalize", ""}}), new String[][]{{"add", "org.apache.commons.math.geometry.Vector3D", "4"}, {"getX", "", "5"}, {"isInfinite", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}, {"org.apache.commons.math.geometry.Vector3D", "normalize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.54; 0.84; -0} {getAlpha=2.141592653589793, getDelta=-0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=-0.5403023058681398, getY=0.8414709848078965,...#242#-569886357", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}, {"org.apache.commons.math.geometry.Vector3D", "toString", ""}}), new String[][]{{"getNorm1", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}}), new String[][]{{"getDelta", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "0.6", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isNaN", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false), new String[][]{{"getY", "", "2"}, {"add", "org.apache.commons.math.geometry.Vector3D", "4"}, {"subtract", "double,org.apache.commons.math.geometry.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}}), new String[][]{{"getY", "", "2"}, {"add", "org.apache.commons.math.geometry.Vector3D", "4"}, {"subtract", "double,org.apache.commons.math.geometry.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1823473664", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false), new String[][]{{"add", "double,org.apache.commons.math.geometry.Vector3D", "4"}, {"subtract", "double,org.apache.commons.math.geometry.Vector3D", "7"}, {"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:11>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.682941969615793", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isNaN", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}, {"org.apache.commons.math.geometry.Vector3D", "getY", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}, {"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{0.54; 0; 0.84}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}, {"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}}), new String[][]{{"getNormInf", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}, {"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}}), new String[][]{{"getNormInf", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"1.0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.46; (-Infinity); (Infinity)} {getAlpha=-1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=-0.45969769413186023, getY=-Infinity, g...#243#-599001142", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}}), new String[][]{{"scalarMultiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0; 0; -0} {getAlpha=3.141592653589793, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=-0.0, getY=0.0, getZ=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"scalarMultiply", "double", "2"}, {"getDelta", "", "7"}, {"getDelta", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getNormSq", "", "1"}, {"getNormInf", "", "6"}, {"getNorm", "", "0"}, {"add", "org.apache.commons.math.geometry.Vector3D", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{1; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=1.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getNormSq", "", "1"}, {"getNormInf", "", "6"}, {"getNorm", "", "0"}, {"add", "org.apache.commons.math.geometry.Vector3D", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:5>"}, true), new String[][]{{"getNorm1", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:0>"}, true), new String[][]{{"getNorm1", "", "7"}, {"getAlpha", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"normalize", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=-0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.54; -0; -0.84} {getAlpha=-3.141592653589793, getDelta=-1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=-0.5403023058681398, getY=-0.0, getZ=-0.841...#245#386618558", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}, {"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}, {"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1823473664", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "2.2250738585072014E-308", "<sample:0>"}, {"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{0.54; -0.84; 0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "2.2250738585072014E-308", "<sample:0>"}, {"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"Infinity", "<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}, {"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8414709848078965", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}}), new String[][]{{"getNormSq", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:,,\017I>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"2.2250738585072014E-308", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}}), new String[][]{{"getNorm", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"NaN", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "Infinity", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"NaN", "<sample:7>"}, false, 12, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "Infinity", "<sample:0>"}}, 2), new String[][]{{"getNorm", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-0.24", "<sample:8>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-0.48", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.8; -1.25; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.4800000000000002, getNorm1=2.045024470200534, getNormInf=1.2453770575156868, getNormSq=2.1904000000000003, getX=0.7996474126848468, getY=-1.2453...#254#1616192542", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-0.48", "<sample:6>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:11>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.682941969615793", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isNaN", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isNaN", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isNaN", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm1", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3817732906760363", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "normalize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:9>"}}), new String[][]{{"add", "double,org.apache.commons.math.geometry.Vector3D", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; 1; -0} {getAlpha=1.5707963267948966, getDelta=-0.0, getNorm=1.0, getNorm1=1.0, getNormInf=1.0, getNormSq=1.0, getX=0.0, getY=1.0, getZ=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:9>"}, {"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}}), new String[][]{{"negate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); -0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=-0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}}, 3), new String[][]{{"add", "double,org.apache.commons.math.geometry.Vector3D", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:8>"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{1.08; -1.68; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=2.0, getNorm1=2.7635465813520725, getNormInf=1.682941969615793, getNormSq=4.0, getX=1.0806046117362795, getY=-1.682941969615793, getZ=0.0, isInfi...#224#-503443366", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getY", "", "0"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getY", "", "0"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getY", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getY", "", "0"}, {"getZ", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.0", "<sample:5>"}, false), new String[][]{{"getZ", "", "2"}, {"normalize", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.9999", "<sample:2>"}, false, 0, null, 2), new String[][]{{"getZ", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.9999", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.46; (-Infinity); (Infinity)} {getAlpha=-1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=-0.45959769413186025, getY=-Infinity, g...#243#-2125212947", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-26.90901", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{15.08; -23.48; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=27.909009999999995, getNorm1=38.5639245872104, getNormInf=23.48462212971343, getNormSq=778.9128391800998, getX=15.07930245749697, getY=-23.4846...#252#-1231474255", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:3>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-54.99802", "<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "-1.0", "<sample:6>"}}), new String[][]{{"add", "double,org.apache.commons.math.geometry.Vector3D", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:138412053>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "org.apache.commons.math.geometry.Vector3D", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.46; (-Infinity); (Infinity)} {getAlpha=-1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=-0.45969769413186023, getY=-Infinity, g...#243#-599001142", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}, {"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "0.0", "<sample:5>"}, {"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "0.005", "<sample:5>"}, {"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}, {"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}}), new String[][]{{"getAlpha", "", "6"}, {"getDelta", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}, {"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<s:ke>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 10, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<s:ke>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isNaN", "", "3"}, {"orthogonal", "", "3"}, {"getDelta", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"isNaN", "", "3"}, {"orthogonal", "", "3"}, {"getDelta", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"isNaN", "", "3"}, {"orthogonal", "", "3"}, {"getDelta", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"isNaN", "", "3"}, {"orthogonal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.54; 0.84; -0} {getAlpha=2.141592653589793, getDelta=-0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=-0.5403023058681398, getY=0.8414709848078965,...#242#-569886357", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}}, 2), new String[][]{{"subtract", "org.apache.commons.math.geometry.Vector3D", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isInfinite", ""}}), new String[][]{{"getAlpha", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{1.54; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.5403023058681398, getY=Infinity, getZ=-...#239#1974054414", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"getNorm1", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"getNorm1", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isNaN", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isNaN", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.54; 0.84; -0} {getAlpha=2.141592653589793, getDelta=-0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=-0.5403023058681398, getY=0.8414709848078965,...#242#-569886357", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}}, 1), new String[][]{{"getNorm1", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3817732906760363", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}}, 1), new String[][]{{"getNorm1", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}}), new String[][]{{"getNorm1", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3817732906760363", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:50>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; 0; 0.84} {getAlpha=0.0, getDelta=1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=0.0, getZ=0.8414709848078965, isInfin...#223#2031762988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}}, 3), new String[][]{{"getX", "", "5"}, {"scalarMultiply", "double", "1"}, {"getDelta", "", "2"}, {"isInfinite", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<null>"}, {"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}}, 3), new String[][]{{"getX", "", "5"}, {"scalarMultiply", "double", "1"}, {"getDelta", "", "2"}, {"isInfinite", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}, {"org.apache.commons.math.geometry.Vector3D", "add", "org.apache.commons.math.geometry.Vector3D", "<sample:6>"}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<null>"}}, 1), new String[][]{{"getX", "", "5"}, {"scalarMultiply", "double", "1"}, {"getDelta", "", "0"}, {"isInfinite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"5.133268763396046E19"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}, {"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{27,735,169,495,037,780,000; -43,194,967,216,184,840,000; 0} {getAlpha=-0.9999999999999999, getDelta=0.0, getNorm=5.133268763396046E19, getNorm1=7.093013671122262E19, getNormInf=4.319496721618484E19, ...#327#-1595251736", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"-0.660999"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0.36; 0.56; -0} {getAlpha=2.141592653589793, getDelta=-0.0, getNorm=0.660999, getNorm1=0.9133507633635694, getNormInf=0.5562114794870348, getNormSq=0.436919678001, getX=-0.35713928387653454, getY=0....#259#867321434", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false), new String[][]{{"getZ", "", "3"}, {"getNormInf", "", "0"}, {"scalarMultiply", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(-Infinity); (Infinity); (NaN)} {getAlpha=2.356194490192345, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=-Infinity, getY=Infinity, getZ=NaN, isInfinite=false, isNaN=t...#204#-22308525", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{0.54; -0.84; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965, getZ=0.0, isIn...#226#-1905086651", SearchInputFactory_scaffolding.receiverState());
 }
}
