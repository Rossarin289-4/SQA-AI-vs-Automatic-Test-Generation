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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 1), new String[][]{{"crossProduct", "org.apache.commons.math3.geometry.Vector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}}, 3), new String[][]{{"wholeLine", "", "5"}, {"getSegments", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>"}}, 2), new String[][]{{"wholeLine", "", "1"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 2), new String[][]{{"add", "double,org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 3), new String[][]{{"normalize", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 3), new String[][]{{"normalize", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0.5403023059; -0.8414709848; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=0.5403023058681398, getY=-0.8414709848078965...#242#23178590", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"getAlpha", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"negate", "", "4"}, {"add", "org.apache.commons.math3.geometry.Vector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getSegments", "", "4"}, {"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}, 1), new String[][]{{"getSegments", "", "4"}, {"contains", "java.lang.Object", "4"}, {"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Line", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 1), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-100.0"}, false, 0, null, 3), new String[][]{{"getY", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-99.99999999999999"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-99.99999999999999"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-99.99999999999999"}, false, 0, null, 1), new String[][]{{"add", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:9>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "-Infinity"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>"}}, 3), new String[][]{{"distance1", "org.apache.commons.math3.geometry.Vector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "Infinity"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "18.12"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 2), new String[][]{{"add", "org.apache.commons.math3.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 3), new String[][]{{"add", "org.apache.commons.math3.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Line", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:11>"}}, 3), new String[][]{{"getSpace", "", "6"}, {"getDimension", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 2), new String[][]{{"getSpace", "", "6"}, {"getDimension", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.0"}}, 1), new String[][]{{"getSegments", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.5707963267448966"}, false, 2, new String[][]{}, 3), new String[][]{{"dotProduct", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Line", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2), new String[][]{{"getSpace", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 1), new String[][]{{"getZero", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}}, 1), new String[][]{{"getNormSq", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "31.415926534897935"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"getAlpha", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}), new String[][]{{"normalize", "", "0"}, {"getNormInf", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"3.141592653489793"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"Infinity"}, false), new String[][]{{"isInfinite", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}), new String[][]{{"isInfinite", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}), new String[][]{{"isInfinite", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-Infinity"}, false), new String[][]{{"add", "org.apache.commons.math3.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:2>"}}), new String[][]{{"normalize", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{-0; 0; 0} {getAlpha=3.141592653589793, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=-0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.0"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:2>"}}), new String[][]{{"normalize", "", "6"}, {"orthogonal", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:7>", "<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Line", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false), new String[][]{{"toSubSpace", "org.apache.commons.math3.geometry.Vector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"dotProduct", "org.apache.commons.math3.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"47.0"}, false), new String[][]{{"getY", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"distanceSq", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "-2.0000000000000004E-12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>"}}), new String[][]{{"getAlpha", "", "1"}, {"getNorm", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}), new String[][]{{"orthogonal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3069328285239343", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>"}}), new String[][]{{"getSpace", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>"}}), new String[][]{{"getSpace", "", "4"}, {"getSubSpace", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>"}}), new String[][]{{"getSpace", "", "4"}, {"getSubSpace", "", "2"}, {"getSubSpace", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D", actual.getClass().getName());
  assertEquals("{getDimension=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:7>"}, false), new String[][]{{"getSpace", "", "4"}, {"getSubSpace", "", "2"}, {"getSubSpace", "", "6"}, {"getDimension", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}}), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "5"}, {"revert", "", "6"}, {"distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3069328285239343", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "5"}, {"revert", "", "6"}, {"distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "4"}, {"contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}}), new String[][]{{"getSegments", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}), new String[][]{{"orthogonal", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false), new String[][]{{"getDelta", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false), new String[][]{{"getSpace", "", "1"}, {"getDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}}), new String[][]{{"getSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}), new String[][]{{"getZero", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>"}}, 2), new String[][]{{"distance1", "org.apache.commons.math3.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, null, 2), new String[][]{{"getNorm1", "", "5"}, {"add", "double,org.apache.commons.math3.geometry.Vector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, null, 2), new String[][]{{"getNorm1", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9097978387869111", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.695322479525008E-17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false), new String[][]{{"pointAt", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 1), new String[][]{{"getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>", "<sample:0>"}}, 3), new String[][]{{"isNaN", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.0"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>", "<sample:0>"}}, 3), new String[][]{{"distance1", "org.apache.commons.math3.geometry.Vector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 2), new String[][]{{"getX", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "NaN"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"toSubSpace", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}), new String[][]{{"getX", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "-1.7976931348623157E308"}}, 3), new String[][]{{"getX", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-Infinity"}, false, 12, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}), new String[][]{{"orthogonal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2), new String[][]{{"closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2), new String[][]{{"pointAt", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{-0.5403023059; 0.8414709848; 0} {getAlpha=2.141592653589793, getDelta=0.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=-0.5403023058681398, getY=0.841...#255#294788819", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}}, 2), new String[][]{{"getOrigin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0.7701511529; 0; 0.4207354924} {getAlpha=0.0, getDelta=0.49999999999999994, getNorm=0.8775825618903728, getNorm1=1.190886645338018, getNormInf=0.7701511529340699, getNormSq=0.7701511529340699, getX=0...#285#-444741077", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 19, new String[][]{}), new String[][]{{"scalarMultiply", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0.4794255386; -0; -0.8775825619} {getAlpha=-0.0, getDelta=-1.070796326794897, getNorm=1.0, getNorm1=1.357008100494576, getNormInf=0.8775825618903729, getNormSq=1.0000000000000002, getX=0.479425538604...#274#816483283", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5403023058681398", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2919265817264289", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "Infinity"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"crossProduct", "org.apache.commons.math3.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathIllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false), new String[][]{{"getSegments", "", "6"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getAlpha", "", "7"}, {"getNorm", "", "0"}, {"distanceInf", "org.apache.commons.math3.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"getSegments", "", "6"}, {"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"getSpace", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"getZ", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}, 1), new String[][]{{"negate", "", "6"}, {"getY", "", "6"}, {"orthogonal", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}}), new String[][]{{"getSegments", "", "3"}, {"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}}), new String[][]{{"getSegments", "", "3"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}}, 2), new String[][]{{"getSegments", "", "3"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>"}}, 3), new String[][]{{"toSubSpace", "org.apache.commons.math3.geometry.Vector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 1), new String[][]{{"getNormInf", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "-1.0"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"pointAt", "double", "3"}, {"negate", "", "0"}, {"crossProduct", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}, 2), new String[][]{{"getSegments", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 2), new String[][]{{"getX", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getSegments", "", "7"}, {"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}), new String[][]{{"wholeLine", "", "5"}, {"getSegments", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 3), new String[][]{{"isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"3.141592653489793"}, false), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false), new String[][]{{"getSegments", "", "6"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 3), new String[][]{{"reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "5"}, {"closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "4"}, {"getDelta", "", "6"}, {"negate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}}, 1), new String[][]{{"getSegments", "", "5"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 3), new String[][]{{"getSegments", "", "5"}, {"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}), new String[][]{{"getSegments", "", "3"}, {"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>"}}), new String[][]{{"getSegments", "", "3"}, {"addAll", "java.util.Collection", "2"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 0, null, 3), new String[][]{{"isInfinite", "", "5"}, {"getSpace", "", "1"}, {"getSubSpace", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"0.0"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.0E-10"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0.0000000001; -0.0000000001; 0} {getAlpha=-1.0, getDelta=0.0, getNorm=1.0E-10, getNorm1=1.3817732906760362E-10, getNormInf=8.414709848078965E-11, getNormSq=1.0E-20, getX=5.4030230586813976E-11, getY=...#264#-374765322", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1), new String[][]{{"getOrigin", "", "2"}, {"getNormSq", "", "5"}, {"getX", "", "6"}, {"getNormSq", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7701511529340699", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 3), new String[][]{{"getZero", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 1), new String[][]{{"negate", "", "4"}, {"getY", "", "0"}, {"getAlpha", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getSegments", "", "0"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 2), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}, {"getSegments", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}, 3), new String[][]{{"getAlpha", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 3), new String[][]{{"getSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "0"}, {"wholeLine", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.SubLine", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "0"}, {"wholeLine", "", "7"}, {"getSegments", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 13, new String[][]{}), new String[][]{{"getY", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.4513134984882257", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5374632182104078", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getAbscissa", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.257543869559147", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 2), new String[][]{{"getSegments", "", "6"}, {"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$SubList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}}, 3), new String[][]{{"getSegments", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 1), new String[][]{{"revert", "", "0"}, {"reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "5"}, {"pointAt", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getY", "", "7"}, {"getY", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 2), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 2), new String[][]{{"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", "double", "1.0"}}), new String[][]{{"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 3), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 1), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false), new String[][]{{"getAlpha", "", "7"}, {"getZero", "", "1"}, {"normalize", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:19>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7645560835912093", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:19>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7645560835912093", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.304996324773217E-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3069328285239343", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 1), new String[][]{{"getX", "", "5"}, {"getZero", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}), new String[][]{{"isInfinite", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 3), new String[][]{{"distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getZ", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>"}}, 1), new String[][]{{"getNorm", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}}, 2), new String[][]{{"getSpace", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"1.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 2), new String[][]{{"orthogonal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"NaN"}, false, 13, new String[][]{}, 3), new String[][]{{"getZero", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 3), new String[][]{{"wholeLine", "", "1"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"wholeLine", "", "0"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 35, new String[][]{}, 2), new String[][]{{"contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "6"}, {"getOrigin", "", "6"}, {"getDelta", "", "5"}, {"getSpace", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", ""}}, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}}, 2), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 2), new String[][]{{"getSegments", "", "7"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 3), new String[][]{{"getSegments", "", "6"}, {"lastIndexOf", "java.lang.Object", "5"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:1>"}}, 3), new String[][]{{"getSegments", "", "6"}, {"lastIndexOf", "java.lang.Object", "5"}, {"addAll", "java.util.Collection", "0"}, {"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:8>"}}, 1), new String[][]{{"orthogonal", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:8>"}}, 1), new String[][]{{"orthogonal", "", "1"}, {"getNormSq", "", "2"}, {"getSpace", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 3), new String[][]{{"normalize", "", "1"}, {"normalize", "", "2"}, {"getSpace", "", "7"}, {"getDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", ""}}, 2), new String[][]{{"getX", "", "0"}, {"getZ", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:5>"}}, 2), new String[][]{{"getX", "", "0"}, {"getDelta", "", "7"}, {"orthogonal", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"-68.44000000000003"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 3), new String[][]{{"getAlpha", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.141592653589793", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"3.141592653489793"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 3), new String[][]{{"getAlpha", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "wholeLine", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}}, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{-0.9947453719; 0; 0.1023799053} {getAlpha=3.141592653589793, getDelta=0.10255960581695837, getNorm=1.0, getNorm1=1.097125277221194, getNormInf=0.9947453719391959, getNormSq=1.0, getX=-0.9947453719391...#270#-1643174844", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:1>", "<sample:4>"}}, 2), new String[][]{{"getSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<null>"}}, 2), new String[][]{{"normalize", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<null>"}}), new String[][]{{"orthogonal", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}}, 3), new String[][]{{"getZero", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}}), new String[][]{{"getY", "", "3"}, {"getSpace", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "toSpace", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:12>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:6>"}}, 3), new String[][]{{"getY", "", "3"}, {"getSpace", "", "5"}, {"getSubSpace", "", "1"}, {"getDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9564407304593018", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "distance", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 1), new String[][]{{"getNorm", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8775825618903728", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:4>"}}, 3), new String[][]{{"getNorm", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8775825618903728", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "pointAt", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<sample:6>"}}, 1), new String[][]{{"isInfinite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getDirection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", ""}}, 3), new String[][]{{"getSpace", "", "0"}, {"getSubSpace", "", "4"}, {"getSubSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D", actual.getClass().getName());
  assertEquals("{getDimension=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:8>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}}, 1), new String[][]{{"getNormSq", "", "6"}, {"getZero", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; 0} {getAlpha=0.0, getDelta=NaN, getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, getZ=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "closestPoint", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.Line"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.threed.Line", "isSimilarTo", "org.apache.commons.math3.geometry.euclidean.threed.Line", "<sample:13>"}}, 1), new String[][]{{"getNormSq", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "getOrigin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "reset", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "<null>", "<sample:3>"}}, 3), new String[][]{{"orthogonal", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.Line", "org.apache.commons.math3.geometry.euclidean.threed.Line", "revert", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.Line", "toSubSpace", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}}, 2), new String[][]{{"contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "5"}, {"contains", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
