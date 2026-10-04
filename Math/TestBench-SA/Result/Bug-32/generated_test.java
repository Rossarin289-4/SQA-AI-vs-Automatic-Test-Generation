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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}), new String[][]{{"getMinus", "", "3"}, {"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!NullPointerException, getSize=0.0, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:3>", "<sample:6>"}}, 3), new String[][]{{"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:3>", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}}, 3), new String[][]{{"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!NullPointerException, getSize=!NullPointerException, getVertices=!NullPointerException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 3), new String[][]{{"copySelf", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"1.65"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:6>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:6>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}}, 1), new String[][]{{"split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}, {"getPlus", "", "7"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}}, 2), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "0.0610000001"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 3), new String[][]{{"buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!ClassCastException, getVertices=[], isEmpty=!ClassCastException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}, {"getBoundarySize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:6>"}}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}, {"getBoundarySize", "", "6"}, {"contains", "org.apache.commons.math3.geometry.partitioning.Region", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}, {"getBoundarySize", "", "6"}, {"getSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}, {"getBoundarySize", "", "6"}, {"getSize", "", "2"}, {"getBarycenter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}, {"getBoundarySize", "", "6"}, {"getSize", "", "2"}, {"checkPoint", "org.apache.commons.math3.geometry.Vector", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:5>"}}, 3), new String[][]{{"getSize", "", "1"}, {"getHyperplane", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-8.005"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "3.4028234663852886E38"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=3.4028234663852886E38, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}}), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "4"}, {"getBarycenter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "4"}, {"getBarycenter", "", "2"}, {"distance", "org.apache.commons.math3.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<null>"}}), new String[][]{{"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}), new String[][]{{"copySelf", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}), new String[][]{{"getCut", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"3.4028234663852886E38"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=3.4028234663852886E38, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-3.4028234663852886E38"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=-3.4028234663852886E38, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-3.402823466385289E38"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=-3.402823466385289E38, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:9>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"3.0"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree", "org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:1>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:1>"}, false), new String[][]{{"copySelf", "", "0"}, {"getTree", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 27, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:7>"}}), new String[][]{{"getBoundarySize", "", "0"}, {"checkPoint", "org.apache.commons.math3.geometry.Vector", "0"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:7>"}}), new String[][]{{"getBoundarySize", "", "0"}, {"checkPoint", "org.apache.commons.math3.geometry.Vector", "0"}, {"isEmpty", "", "2"}, {"getBoundarySize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "-4.9999999999999995E-11"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=-4.9999999999999995E-11, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}, {"getBoundarySize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}, {"getBoundarySize", "", "6"}, {"contains", "org.apache.commons.math3.geometry.partitioning.Region", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}, {"getBoundarySize", "", "6"}, {"getSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "NaN"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=NaN, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "NaN"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=NaN, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "NaN"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=NaN, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:4>"}}), new String[][]{{"getSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:1>"}}), new String[][]{{"getSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:1>"}}), new String[][]{{"getSize", "", "5"}, {"getSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:5>"}}), new String[][]{{"getSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}), new String[][]{{"contains", "org.apache.commons.math3.geometry.partitioning.Region", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:2>"}}, 3), new String[][]{{"distanceInf", "org.apache.commons.math3.geometry.Vector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}}), new String[][]{{"getSize", "", "5"}, {"getBarycenter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"add", "double,org.apache.commons.math3.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}}), new String[][]{{"distanceInf", "org.apache.commons.math3.geometry.Vector", "0"}, {"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}}), new String[][]{{"distanceInf", "org.apache.commons.math3.geometry.Vector", "0"}, {"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}}, 3), new String[][]{{"distanceInf", "org.apache.commons.math3.geometry.Vector", "0"}, {"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:1>"}}), new String[][]{{"negate", "", "5"}, {"normalize", "", "2"}, {"getSpace", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3), new String[][]{{"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "5"}, {"setAttribute", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!ClassCastException, getVertices=[], isEmpty=!ClassCastException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "1.0"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=1.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "-3.4028234663852886E38"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=-3.4028234663852886E38, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "3.4028234663852886E38"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=3.4028234663852886E38, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "-5.0000000000000005E-12"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=-5.0000000000000005E-12, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:2>"}}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:2>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:2>", "<sample:5>"}}, 2), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:5>"}}, 2), new String[][]{{"contains", "org.apache.commons.math3.geometry.partitioning.Region", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"getSpace", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"getSpace", "", "7"}, {"getSubSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D", actual.getClass().getName());
  assertEquals("{getDimension=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"getSpace", "", "7"}, {"getSubSpace", "", "3"}, {"getDimension", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}), new String[][]{{"getSpace", "", "7"}, {"getSubSpace", "", "3"}, {"getDimension", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getBoundarySize", "", "4"}, {"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 2), new String[][]{{"getSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:0>"}}, 1), new String[][]{{"getSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:5>", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}), new String[][]{{"getSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:1>"}}), new String[][]{{"buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"contains", "org.apache.commons.math3.geometry.partitioning.Region", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1), new String[][]{{"contains", "org.apache.commons.math3.geometry.partitioning.Region", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}), new String[][]{{"getTree", "boolean", "0"}, {"getMinus", "", "4"}, {"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}), new String[][]{{"getTree", "boolean", "0"}, {"getMinus", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}), new String[][]{{"getTree", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 3), new String[][]{{"getTree", "boolean", "0"}, {"getCell", "org.apache.commons.math3.geometry.Vector", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 3), new String[][]{{"getTree", "boolean", "0"}, {"getCell", "org.apache.commons.math3.geometry.Vector", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:6>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:6>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:6>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:1>", "<sample:0>"}}, 2), new String[][]{{"getBarycenter", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:2>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:7>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "-1.7976931348623157E308"}}, 1), new String[][]{{"getVertices", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathInternalError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "-1.7976931348623157E308"}}, 1), new String[][]{{"getVertices", "", "5"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}), new String[][]{{"copySelf", "", "0"}, {"getSize", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}), new String[][]{{"copySelf", "", "0"}, {"getSize", "", "4"}, {"getBarycenter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "0"}, {"copySelf", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "0"}, {"getSize", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}}, 3), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "0"}, {"getSize", "", "4"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}}, 3), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "0"}, {"getSize", "", "4"}, {"isEmpty", "", "6"}, {"isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}}, 3), new String[][]{{"getSize", "", "3"}, {"getSize", "", "4"}, {"isEmpty", "", "6"}, {"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}}, 3), new String[][]{{"getSize", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=1.7976931348623157E308, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "3.4028234663852886E38"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=3.4028234663852886E38, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=NaN, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"3.0"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"2.973"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:1>", "<sample:6>"}}, 2), new String[][]{{"getPlus", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:1>", "<sample:6>"}}, 2), new String[][]{{"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:1>", "<sample:6>"}}, 2), new String[][]{{"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}, 3), new String[][]{{"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "0"}, {"setAttribute", "java.lang.Object", "3"}, {"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=!ClassCastException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 3), new String[][]{{"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "0"}, {"setAttribute", "java.lang.Object", "3"}, {"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 3), new String[][]{{"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "0"}, {"split", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}}, 3), new String[][]{{"copySelf", "", "0"}, {"setAttribute", "java.lang.Object", "3"}, {"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}}, 1), new String[][]{{"getParent", "", "0"}, {"setAttribute", "java.lang.Object", "3"}, {"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "3"}, {"insertInTree", "org.apache.commons.math3.geometry.partitioning.BSPTree,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}, 2), new String[][]{{"getParent", "", "0"}, {"setAttribute", "java.lang.Object", "3"}, {"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "3"}, {"insertInTree", "org.apache.commons.math3.geometry.partitioning.BSPTree,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:6>"}}, 1), new String[][]{{"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "0"}, {"setAttribute", "java.lang.Object", "3"}, {"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:6>"}}, 1), new String[][]{{"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "0"}, {"setAttribute", "java.lang.Object", "3"}, {"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!ClassCastException, getVertices=[], isEmpty=!ClassCastException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:5>"}}, 1), new String[][]{{"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "0"}, {"split", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 1), new String[][]{{"getMinus", "", "0"}, {"split", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "3"}, {"getCell", "org.apache.commons.math3.geometry.Vector", "0"}, {"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", new String[]{"org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}}, 1), new String[][]{{"getMinus", "", "0"}, {"split", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "3"}, {"getCell", "org.apache.commons.math3.geometry.Vector", "0"}, {"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}}), new String[][]{{"getMinus", "", "0"}, {"split", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 1), new String[][]{{"insertInTree", "org.apache.commons.math3.geometry.partitioning.BSPTree,boolean", "0"}, {"split", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "3"}, {"insertCut", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", "double", "1.0E-10"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", "boolean", "true"}}, 1), new String[][]{{"getCell", "org.apache.commons.math3.geometry.Vector", "6"}, {"getAttribute", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=1.0E-10, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<null>"}}, 1), new String[][]{{"getParent", "", "6"}, {"getParent", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}), new String[][]{{"getParent", "", "2"}, {"getCut", "", "7"}, {"isEmpty", "", "6"}, {"getHyperplane", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getOriginOffset=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}), new String[][]{{"getParent", "", "2"}, {"getCut", "", "7"}, {"split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}, {"getMinus", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 1), new String[][]{{"getParent", "", "2"}, {"getCut", "", "7"}, {"isEmpty", "", "6"}, {"getHyperplane", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getOriginOffset=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.Vector", "<sample:3>"}}, 1), new String[][]{{"getParent", "", "2"}, {"getCut", "", "7"}, {"isEmpty", "", "6"}, {"copySelf", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getTree", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "computeGeometricalProperties", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}}, 2), new String[][]{{"copySelf", "", "5"}, {"visit", "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor", "3"}, {"getCell", "org.apache.commons.math3.geometry.Vector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=0.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=0.0, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"getVertices", "", "3"}});
  assertNotNull(actual);
  assertEquals("[[Lorg.apache.commons.math3.geometry.euclidean.twod.Vector2D;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<null>"}, false, 12, new String[][]{}, 1), new String[][]{{"getVertices", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:2>"}, false, 12, new String[][]{}, 1), new String[][]{{"getVertices", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBarycenter", ""}}, 1), new String[][]{{"copySelf", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "contains", "org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.BSPTree"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getBoundarySize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-0.6"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getBoundarySize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-1.0"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=-1.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-2.0"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=-2.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-4.0"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=-4.0, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}}, 3), new String[][]{{"buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "7"}, {"copySelf", "", "7"}, {"contains", "org.apache.commons.math3.geometry.partitioning.Region", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", new String[]{"org.apache.commons.math3.geometry.Vector"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("INSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"2.7999999998000002"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=!MathInternalError, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"2.7999999998000002"}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=!ClassCastException, getSize=!ClassCastException, getVertices=!ClassCastException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=Infinity, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"4.2"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=4.2, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-40.8"}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setBarycenter", "org.apache.commons.math3.geometry.Vector", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=NaN, getSize=-40.8, getVertices=!MathInternalError, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"3.4028234663852886E38"}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:2>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=!NullPointerException, getVertices=[], isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "setSize", new String[]{"double"}, new String[]{"-6.805646932770577E38"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "checkPoint", "org.apache.commons.math3.geometry.partitioning.BSPTree,org.apache.commons.math3.geometry.Vector", "<sample:2>", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "getVertices", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBoundarySize=0.0, getSize=-6.805646932770577E38, getVertices=[], isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
