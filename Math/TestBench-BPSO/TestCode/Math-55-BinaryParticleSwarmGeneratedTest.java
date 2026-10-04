package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}, {"org.apache.commons.math.geometry.Vector3D", "toString", ""}}), new String[][]{{"isInfinite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"2.225073858507201E-308"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "1.1125369292536007E-308", "<sample:2>"}}), new String[][]{{"isNaN", "", "1"}, {"normalize", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}), new String[][]{{"orthogonal", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"scalarMultiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(-Infinity); (-Infinity); (Infinity)} {getAlpha=-2.356194490192345, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=-Infinity, getY=-Infinity, getZ=In...#237#-383330180", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:9>", "<sample:9>"}, true, 0, null, 3), new String[][]{{"orthogonal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "org.apache.commons.math.geometry.Vector3D", "<sample:10>"}}, 1), new String[][]{{"getNorm", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "scalarMultiply", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{1; (Infinity); (-Infinity)}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:11>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:12>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}, 2), new String[][]{{"getNormInf", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; -0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"add", "org.apache.commons.math.geometry.Vector3D", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getDelta", ""}, {"org.apache.commons.math.geometry.Vector3D", "negate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 1), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:11>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-0.0", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"negate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:6>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "220.70000000000002", "<sample:2>"}}, 3), new String[][]{{"getDelta", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:6>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm1", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isNaN", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}, {"org.apache.commons.math.geometry.Vector3D", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-Infinity", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm", ""}}), new String[][]{{"normalize", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{-0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=-0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1823473664", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"0.6", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "scalarMultiply", "double", "0.9999"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"Infinity", "<sample:12>"}, false, 7, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}, {"org.apache.commons.math.geometry.Vector3D", "scalarMultiply", "double", "1.1125369292536007E-308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:4>"}, true), new String[][]{{"getNormInf", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "-1.0", "<sample:3>"}}), new String[][]{{"isNaN", "", "6"}, {"getNormInf", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:11>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1900196790587718", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormSq", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:11>", "<sample:11>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"253.48999999999998"}, false, 7, new String[][]{}), new String[][]{{"add", "double,org.apache.commons.math.geometry.Vector3D", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"-0.6", "<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}}), new String[][]{{"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"add", "org.apache.commons.math.geometry.Vector3D", "3"}, {"subtract", "double,org.apache.commons.math.geometry.Vector3D", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:9>"}, false, 2, new String[][]{}), new String[][]{{"getNormInf", "", "2"}, {"orthogonal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}}), new String[][]{{"orthogonal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getZ", "", "5"}, {"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "scalarMultiply", "double", "-2.1"}}), new String[][]{{"getNormSq", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"1.1125369292536007E-308", "<sample:6>"}, false, 1, new String[][]{}, 2), new String[][]{{"normalize", "", "7"}, {"getNorm1", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}, 2), new String[][]{{"getX", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:10>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:10>"}, true, 0, null, 3), new String[][]{{"isInfinite", "", "3"}, {"getX", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNorm", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:9>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; -0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "2.225073858507201E-308", "<sample:3>"}}), new String[][]{{"getZ", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:10>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; -0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "subtract", "double,org.apache.commons.math.geometry.Vector3D", "5133268763396045979", "<sample:1>"}}, 1), new String[][]{{"orthogonal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:10>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getDelta", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}, {"org.apache.commons.math.geometry.Vector3D", "normalize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormInf", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "isInfinite", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:0>"}, true), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "dotProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getNorm", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:8>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getNorm1", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}}, 1), new String[][]{{"orthogonal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getNormSq", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "angle", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getZ", ""}, {"org.apache.commons.math.geometry.Vector3D", "subtract", "org.apache.commons.math.geometry.Vector3D", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{1; (Infinity); (-Infinity)}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceSq", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "-1.7976931348623157E308", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "orthogonal", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<s:kiey>"}}, 3), new String[][]{{"getNormInf", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getAlpha", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isNaN", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getAlpha", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getX", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"8.988465674311579E307", "<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"getDelta", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getNormInf", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isInfinite", "", "7"}, {"getNorm", "", "1"}, {"add", "double,org.apache.commons.math.geometry.Vector3D", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:8>", "<sample:6>"}, true), new String[][]{{"orthogonal", "", "6"}, {"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"255.33", "<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "scalarMultiply", "double", "Infinity"}, {"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "-0.4", "<sample:6>"}}, 3), new String[][]{{"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "add", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"1.19", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}}, 2), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1; (Infinity); (-Infinity)} {getAlpha=1.5707963267948966, getDelta=NaN, getNorm=Infinity, getNorm1=Infinity, getNormInf=Infinity, getNormSq=Infinity, getX=1.0, getY=Infinity, getZ=-Infinity, isInfini...#221#-1121777676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distance1", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "negate", ""}, {"org.apache.commons.math.geometry.Vector3D", "isNaN", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:1>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "subtract", new String[]{"double", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"1.0", "<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "orthogonal", ""}, {"org.apache.commons.math.geometry.Vector3D", "equals", "java.lang.Object", "<i:0>"}}, 2), new String[][]{{"add", "double,org.apache.commons.math.geometry.Vector3D", "7"}, {"isInfinite", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "distanceInf", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getY", ""}, {"org.apache.commons.math.geometry.Vector3D", "getNorm1", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "crossProduct", new String[]{"org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D"}, new String[]{"<sample:7>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "scalarMultiply", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "getX", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "normalize", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"subtract", "double,org.apache.commons.math.geometry.Vector3D", "6"}, {"orthogonal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getY", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.Vector3D", "org.apache.commons.math.geometry.Vector3D", "getZ", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.Vector3D", "add", "double,org.apache.commons.math.geometry.Vector3D", "6.4", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
