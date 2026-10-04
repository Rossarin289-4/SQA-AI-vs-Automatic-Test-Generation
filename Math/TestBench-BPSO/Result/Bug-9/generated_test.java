package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>", "<sample:2>"}}), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "3"}, {"getDirection", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); -0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=-0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>", "<sample:0>"}}), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>", "<sample:2>"}}, 3), new String[][]{{"getSegments", "", "0"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"3.1415926534897936"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:5>", "<sample:5>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 1), new String[][]{{"distance1", "org.apache.commons.math3.geometry.Vector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>", "<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:8>"}}, 3), new String[][]{{"normalize", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2), new String[][]{{"getSegments", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}, 2), new String[][]{{"getNormSq", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "4.9E-324"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getY", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"add", "org.apache.commons.math3.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "6.283185306979586"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:6>", "<sample:3>"}}, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>", "<sample:3>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}}, 3), new String[][]{{"subtract", "double,org.apache.commons.math3.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 3), new String[][]{{"getSegments", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 0, null, 1), new String[][]{{"getDelta", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"distanceInf", "org.apache.commons.math3.geometry.Vector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Line", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.0E-10"}}, 1), new String[][]{{"getX", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:8>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Line", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 3), new String[][]{{"distanceSq", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getNormInf", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}}, 2), new String[][]{{"getDirection", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "2.0E-10"}}, 1), new String[][]{{"getY", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:11>"}, false, 0, null, 3), new String[][]{{"getX", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:3>"}}, 1), new String[][]{{"add", "double,org.apache.commons.math3.geometry.Vector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}}, 3), new String[][]{{"getNormSq", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 3), new String[][]{{"contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "5"}, {"wholeLine", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "-35.85840734651021"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}, 2), new String[][]{{"getNorm", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Line", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 2), new String[][]{{"getNormSq", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"toSubSpace", "org.apache.commons.math3.geometry.Vector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.4000000000000001"}}, 2), new String[][]{{"getY", "", "1"}, {"distanceSq", "org.apache.commons.math3.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:6>"}}), new String[][]{{"negate", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false), new String[][]{{"distance1", "org.apache.commons.math3.geometry.Vector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-0.0"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>", "<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"0.0"}, false, 5, new String[][]{}), new String[][]{{"getNorm", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}}), new String[][]{{"getNormInf", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getSegments", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}), new String[][]{{"distance1", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Line", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false), new String[][]{{"negate", "", "7"}, {"getZ", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"add", "double,org.apache.commons.math3.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:8>"}, false), new String[][]{{"getAlpha", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}), new String[][]{{"getDirection", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}), new String[][]{{"getZero", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>"}}), new String[][]{{"getSegments", "", "4"}, {"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 7, new String[][]{}), new String[][]{{"subtract", "double,org.apache.commons.math3.geometry.Vector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<null>"}}), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:6>", "<sample:6>"}}), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}), new String[][]{{"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}), new String[][]{{"crossProduct", "org.apache.commons.math3.geometry.Vector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>", "<sample:4>"}}), new String[][]{{"getSegments", "", "5"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>"}}), new String[][]{{"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>", "<sample:6>"}}), new String[][]{{"getSegments", "", "7"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}), new String[][]{{"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "NaN"}}), new String[][]{{"orthogonal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}}), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}), new String[][]{{"getZero", "", "5"}, {"getAlpha", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "NaN"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}), new String[][]{{"getDelta", "", "6"}, {"getSpace", "", "0"}, {"getSubSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}), new String[][]{{"getSpace", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:2>"}, false), new String[][]{{"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}}), new String[][]{{"getNorm", "", "3"}, {"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"wholeLine", "", "2"}, {"getSegments", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false), new String[][]{{"toSubSpace", "org.apache.commons.math3.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "Infinity"}}), new String[][]{{"wholeLine", "", "5"}, {"getSegments", "", "3"}, {"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false), new String[][]{{"getNorm", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}}), new String[][]{{"getSegments", "", "7"}, {"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>", "<null>"}}), new String[][]{{"getDelta", "", "4"}, {"getSpace", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}), new String[][]{{"getSpace", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}), new String[][]{{"orthogonal", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"orthogonal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}}, 3), new String[][]{{"getSegments", "", "5"}, {"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 1), new String[][]{{"getSegments", "", "7"}, {"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "-3.5"}}, 3), new String[][]{{"getSegments", "", "6"}, {"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 3), new String[][]{{"distance", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 1), new String[][]{{"getSegments", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 3), new String[][]{{"wholeLine", "", "6"}, {"getSegments", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getSegments", "", "5"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>", "<sample:4>"}}, 1), new String[][]{{"getDirection", "", "5"}, {"distanceSq", "org.apache.commons.math3.geometry.Vector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-1.06"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2), new String[][]{{"negate", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}, 1), new String[][]{{"getSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2), new String[][]{{"dotProduct", "org.apache.commons.math3.geometry.Vector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 1), new String[][]{{"getX", "", "3"}, {"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>", "<null>"}}), new String[][]{{"getSegments", "", "2"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:5>"}}, 1), new String[][]{{"orthogonal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>"}}, 1), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}}, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, null, 3), new String[][]{{"getZ", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2), new String[][]{{"getAlpha", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>"}}, 3), new String[][]{{"getSegments", "", "5"}, {"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "NaN"}}, 2), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "-8.988465674311579E307"}}, 1), new String[][]{{"contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "5"}, {"getDirection", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 2), new String[][]{{"orthogonal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getSegments", "", "5"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5921784110706013E-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:9>"}, false, 0, null, 2), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"getSpace", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isInfinite", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getSpace", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}}, 1), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"5.000000000000001E-11"}, false, 6, new String[][]{}, 2), new String[][]{{"getDelta", "", "3"}, {"distance", "org.apache.commons.math3.geometry.Vector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>", "<sample:3>"}}, 1), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getY", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getSpace", "", "0"}, {"getSubSpace", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false), new String[][]{{"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}}, 3), new String[][]{{"contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 1), new String[][]{{"getSegments", "", "4"}, {"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"0.10000000000000002"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 1), new String[][]{{"getX", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 1), new String[][]{{"getSpace", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>", "<sample:2>"}}, 1), new String[][]{{"wholeLine", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 3), new String[][]{{"getSpace", "", "0"}, {"getDimension", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:8>"}}, 2), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "6"}, {"contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"wholeLine", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>"}}), new String[][]{{"isInfinite", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}), new String[][]{{"getSpace", "", "1"}, {"getDimension", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>", "<sample:1>"}}, 2), new String[][]{{"getNormSq", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7963161260823184", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"0.05500000000000001"}, false, 0, null, 2), new String[][]{{"getZero", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 3), new String[][]{{"getSpace", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}, 1), new String[][]{{"getSegments", "", "5"}, {"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>"}}, 1), new String[][]{{"subtract", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getZero", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:8>"}, false, 0, null, 3), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-0.05"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}}), new String[][]{{"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"31.81592653489793"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{-24.3009738543; 12.7293800324; 16.1275329301} {getAlpha=2.6590697201506592, getDelta=0.5314646123775958, getNorm=31.82250406065111, getNorm1=53.15788681684775, getNormInf=24.30097385433534, getNormSq...#326#200440277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"getZero", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:9>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getZero", "", "0"}, {"getNormInf", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}}, 3), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.4628916075470726E-17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"3.141592653489793"}, false, 0, null, 1), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 2), new String[][]{{"getSegments", "", "3"}, {"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{}, 2), new String[][]{{"orthogonal", "", "3"}, {"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>"}}, 1), new String[][]{{"getZero", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 3), new String[][]{{"orthogonal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 2), new String[][]{{"getZero", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 1), new String[][]{{"isInfinite", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 3), new String[][]{{"getY", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}}, 3), new String[][]{{"subtract", "org.apache.commons.math3.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "3.141592653489793"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}}, 3), new String[][]{{"getOrigin", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}, 3), new String[][]{{"isInfinite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5374632182104078", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 2), new String[][]{{"getSegments", "", "0"}, {"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.595009839529386", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 1), new String[][]{{"getSpace", "", "2"}, {"getSubSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}, 1), new String[][]{{"getSegments", "", "1"}, {"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Segment", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getSegments", "", "4"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-1.7976931348623156E306"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:6>"}}, 3), new String[][]{{"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}}), new String[][]{{"getNormSq", "", "0"}, {"orthogonal", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}}, 3), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:8>"}}, 1), new String[][]{{"isInfinite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 1), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{-0.7625067763; 0.4165593504; 0.4950370933} {getAlpha=2.641592653589793, getDelta=0.5178775224309201, getNorm=1.0, getNorm1=1.6741032199611208, getNormInf=0.7625067762753279, getNormSq=1.0, getX=-0.76...#297#-227914596", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}, 1), new String[][]{{"getSpace", "", "1"}, {"getDimension", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}}, 3), new String[][]{{"getSpace", "", "4"}, {"getSubSpace", "", "1"}, {"getDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getSegments", "", "0"}, {"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 3), new String[][]{{"getDelta", "", "4"}, {"orthogonal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getSegments", "", "1"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, null, 1), new String[][]{{"getSpace", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}}, 1), new String[][]{{"isInfinite", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.0"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 3), new String[][]{{"toSubSpace", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.0E-10"}}, 3), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 2), new String[][]{{"getSpace", "", "3"}, {"getSubSpace", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 3), new String[][]{{"orthogonal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5443758991228778", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 2), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getZero", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{}, 1), new String[][]{{"getNorm", "", "5"}, {"orthogonal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:6>", "<sample:3>"}}, 2), new String[][]{{"wholeLine", "", "7"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 1), new String[][]{{"getSpace", "", "0"}, {"getSubSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "NaN"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); -0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=-0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0.7625067763; -0.4165593504; -0.4950370933} {getAlpha=-0.5, getDelta=-0.5178775224309201, getNorm=1.0, getNorm1=1.6741032199611208, getNormInf=0.7625067762753279, getNormSq=1.0, getX=0.76250677627532...#287#-786733851", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>", "<sample:7>"}}, 2), new String[][]{{"orthogonal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"wholeLine", "", "3"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}, 3), new String[][]{{"getSegments", "", "5"}, {"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-1.3999999999000001"}, false, 0, null, 3), new String[][]{{"isInfinite", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.0"}}, 3), new String[][]{{"getZero", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.114017523500922E-17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 3), new String[][]{{"orthogonal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.695322479525008E-17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7625067762753279", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0.5403023059; -127,116,100,615,364,620,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,...#1096#-327429304", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:2>"}}, 3), new String[][]{{"getAlpha", "", "0"}, {"orthogonal", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 1; -0} {getAlpha=1.5707963267948966, getDelta=-0.0, getNorm=0.9999999999999999, getNorm1=0.9999999999999999, getNormInf=0.9999999999999999, getNormSq=0.9999999999999998, getX=0.0, getY=0.999999999...#250#1794891615", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.0340000000000003"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>"}}, 2), new String[][]{{"negate", "", "6"}, {"getY", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5443758991228778", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 2), new String[][]{{"orthogonal", "", "2"}, {"negate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); -0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=-0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1868972416932022", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7071067811865476", String.valueOf(actual));
 }
}
