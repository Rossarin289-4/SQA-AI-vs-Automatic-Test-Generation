package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1), new String[][]{{"getSize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}), new String[][]{{"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=0.0, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:1>", "<sample:2>"}}, 3), new String[][]{{"getCell", "org.apache.commons.math3.geometry.Vector", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}}, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "4"}, {"getHyperplane", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>", "<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getTree", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "-Infinity"}}, 1), new String[][]{{"getBarycenter", "", "6"}, {"add", "org.apache.commons.math3.geometry.Vector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"contains", "org.apache.commons.math3.geometry.partitioning.Region", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:8>"}, false, 0, null, 2), new String[][]{{"getVertices", "", "2"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{}, 3), new String[][]{{"getAttribute", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 3), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"getSize", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!ClassCastException, getVertices=[], isEmpty=!ClassCastException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:12>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 2), new String[][]{{"isEmpty", "", "3"}, {"contains", "org.apache.commons.math3.geometry.partitioning.Region", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:0>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:5>", "<sample:5>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 2), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:10>"}, false, 2, new String[][]{}, 2), new String[][]{{"copySelf", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}, 2), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "2"}, {"getBarycenter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-1.0E-10"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:5>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"getTree", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}, 3), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-6.805646932770577E38"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{}, 3), new String[][]{{"getAttribute", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 2), new String[][]{{"contains", "org.apache.commons.math3.geometry.partitioning.Region", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:3>", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{}, 2), new String[][]{{"getMinus", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"isEmpty", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"getBoundarySize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"0.29999999999999993"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "0.02499999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:1>", "<sample:6>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<null>"}, false, 4, new String[][]{}), new String[][]{{"copySelf", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}), new String[][]{{"getTree", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:9>"}}), new String[][]{{"getBarycenter", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:4>"}}), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:3>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false), new String[][]{{"getBarycenter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}), new String[][]{{"add", "double,org.apache.commons.math3.geometry.Vector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"5.0E-11"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"3.4028234663852882E38"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=3.4028234663852882E38, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:10>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!ClassCastException, getVertices=[], isEmpty=!ClassCastException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:8>"}, false, 6, new String[][]{}), new String[][]{{"getSize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:6>"}, false), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-1.0E-10"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=-1.0E-10, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:7>"}}), new String[][]{{"getCut", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "5"}, {"getBarycenter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:7>", "<sample:5>"}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}), new String[][]{{"getTree", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "-2.0E-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("BOUNDARY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:1>"}, false), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:9>"}, false, 5, new String[][]{}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "3"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}}), new String[][]{{"getVertices", "", "0"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:9>"}}), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "2"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}}), new String[][]{{"getSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:10>"}, false), new String[][]{{"getVertices", "", "6"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:3>"}}), new String[][]{{"getZero", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{0; 0} {getNorm=0.0, getNorm1=0.0, getNormInf=0.0, getNormSq=0.0, getX=0.0, getY=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}), new String[][]{{"getSpace", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"getBoundarySize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:4>", "<sample:1>"}}), new String[][]{{"getTree", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getBoundarySize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getNorm1", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}), new String[][]{{"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>", "<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>", "<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"6.0"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:2>", "<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("OUTSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 3), new String[][]{{"getVertices", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-0.29999999999999993"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}}), new String[][]{{"getZero", "", "4"}, {"isInfinite", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:5>", "<sample:10>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}), new String[][]{{"contains", "org.apache.commons.math3.geometry.partitioning.Region", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 1), new String[][]{{"getVertices", "", "6"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:9>"}}), new String[][]{{"distance1", "org.apache.commons.math3.geometry.Vector", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}}, 2), new String[][]{{"getBarycenter", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:7>"}}, 1), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:2>", "<sample:5>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"getSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 1), new String[][]{{"getBarycenter", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1), new String[][]{{"insertInTree", "org.apache.commons.math3.geometry.partitioning.BSPTree,boolean", "5"}, {"getMinus", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:0>"}}, 3), new String[][]{{"getSpace", "", "3"}, {"getDimension", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "1.7976931348623155E307"}}), new String[][]{{"getSize", "", "1"}, {"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:9>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}, 1), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "5"}, {"getBarycenter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:4>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:3>"}}), new String[][]{{"getBarycenter", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1), new String[][]{{"getVertices", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "-1.7976931348623157E308"}}, 2), new String[][]{{"getSize", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:7>"}}, 1), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getY", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "-0.9999999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}), new String[][]{{"getBarycenter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 3), new String[][]{{"copySelf", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:5>", "<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>", "<sample:2>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 3), new String[][]{{"getBarycenter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{}), new String[][]{{"getCut", "", "0"}, {"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:6>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 1), new String[][]{{"getSpace", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"getTree", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:0>"}}, 3), new String[][]{{"negate", "", "3"}, {"getNormSq", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:11>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 3), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("MINUS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getVertices", "", "3"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getBoundarySize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:9>"}, false, 5, new String[][]{}, 3), new String[][]{{"getSize", "", "1"}, {"getBoundarySize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 2), new String[][]{{"getTree", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 3), new String[][]{{"getTree", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{}, 2), new String[][]{{"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>", "<sample:6>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:10>"}, false, 3, new String[][]{}, 2), new String[][]{{"getBoundarySize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getVertices", "", "3"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 3), new String[][]{{"isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}), new String[][]{{"scalarMultiply", "double", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=0.0, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{}), new String[][]{{"split", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getY", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getBoundarySize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
