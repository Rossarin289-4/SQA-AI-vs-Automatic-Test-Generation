package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:4>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "false"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"getSize", "", "2"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(-Infinity); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=-Infinity, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:16>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}, 1), new String[][]{{"getPlus", "", "4"}, {"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:16>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:18>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:16>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:18>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:16>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 1), new String[][]{{"getPlus", "", "2"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:16>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:1>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}}, 1), new String[][]{{"getPlus", "", "2"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "0"}, {"copySelf", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!NullPointerException, getInf=NaN, getSize=NaN, getSup=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<null>", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getInf=-Infinity, getSize=Infinity, getSup=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<null>", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 1), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:1>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "boolean"}, new String[]{"<sample:1>", "true"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:7>", "false"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "boolean"}, new String[]{"<sample:0>", "true"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:7>"}}, 2), new String[][]{{"reset", "org.apache.commons.math3.geometry.euclidean.twod.Vector2D,double", "1"}, {"revertSelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=3.141592653589793, getOriginOffset=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:0>", "false"}}, 2), new String[][]{{"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:2>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:2>", "false"}}, 2), new String[][]{{"set", "int,java.lang.Object", "2"}, {"getLine", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Line", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:2>", "false"}}, 2), new String[][]{{"set", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Segment", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:2>", "false"}}, 2), new String[][]{{"set", "int,java.lang.Object", "2"}, {"getEnd", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:2>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "boolean"}, new String[]{"<null>", "true"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:4>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}}, 3), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "boolean"}, new String[]{"<sample:7>", "true"}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:3>", "true"}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:0>", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}, 3), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}, 2), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:3>", "<sample:11>"}, false, 0, null, 3), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:5>", "<sample:14>"}, false, 0, null, 3), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "4"}, {"copySelf", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=0.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:5>", "<sample:13>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:7>", "true"}}, 3), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "7"}, {"copySelf", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:7>", "true"}}, 3), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<null>", "true"}}, 3), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "7"}, {"copySelf", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=-Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<null>", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!NullPointerException, getInf=NaN, getSize=NaN, getSup=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getInf=-Infinity, getSize=Infinity, getSup=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"asList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("OUTSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:3>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:3>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=5.283185307179586, getOriginOffset=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=1.0, getOriginOffset=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=3.141592653589793, getOriginOffset=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getOriginOffset=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "false"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 1), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<null>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<null>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:6>", "true"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:5>", "true"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 3), new String[][]{{"getRemainingRegion", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getSize", "", "2"}, {"getTree", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2), new String[][]{{"isEmpty", "", "2"}, {"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("MINUS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 2), new String[][]{{"getSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 2), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}}, 2), new String[][]{{"getSize", "", "2"}, {"isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}}, 2), new String[][]{{"isEmpty", "", "2"}, {"getSize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=-Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!NullPointerException, getInf=NaN, getSize=NaN, getSup=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!NullPointerException, getInf=NaN, getSize=NaN, getSup=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getInf=-Infinity, getSize=Infinity, getSup=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>", "<sample:4>"}, false), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:4>", "true"}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "boolean"}, new String[]{"<sample:2>", "false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=5.283185307179586, getOriginOffset=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:6>", "false"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<null>", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=0.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:0>", "false"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}}), new String[][]{{"isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "boolean"}, new String[]{"<null>", "false"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:3>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=-Infinity, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:2>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=-1.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:1>", "true"}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:5>", "true"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 15, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "3"}, {"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "3"}, {"listIterator", "", "2"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Segment", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=1.0, getOriginOffset=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getOriginOffset=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Plane", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "false"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}), new String[][]{{"intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}}), new String[][]{{"addAll", "java.util.Collection", "4"}, {"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}), new String[][]{{"getInf", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}), new String[][]{{"getInf", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}), new String[][]{{"getInf", "", "1"}, {"getBarycenter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.Vector1D", actual.getClass().getName());
  assertEquals("{(NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}), new String[][]{{"buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "1"}, {"isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "2"}, {"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("HYPER", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:7>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}), new String[][]{{"buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "1"}, {"isEmpty", "org.apache.commons.math3.geometry.partitioning.BSPTree", "2"}, {"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Side", actual.getClass().getName());
  assertEquals("MINUS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}), new String[][]{{"getRemainingRegion", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=Infinity, getInf=!ClassCastException, getSize=!ClassCastException, getSup=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}}), new String[][]{{"getSegments", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}}), new String[][]{{"getSegments", "", "5"}, {"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}}), new String[][]{{"getSegments", "", "5"}, {"containsAll", "java.util.Collection", "7"}, {"addAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:0>", "false"}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", actual.getClass().getName());
  assertEquals("{isDirect=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Plane", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=!NullPointerException, getInf=NaN, getSize=NaN, getSup=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getInf=-Infinity, getSize=Infinity, getSup=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:7>", "true"}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:7>", "true"}}), new String[][]{{"checkPoint", "org.apache.commons.math3.geometry.Vector", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.Region$Location", actual.getClass().getName());
  assertEquals("OUTSIDE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false), new String[][]{{"getSegments", "", "3"}, {"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}}, 1), new String[][]{{"getSegments", "", "3"}, {"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "2"}, {"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2), new String[][]{{"isEmpty", "", "2"}, {"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:6>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:6>"}}), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:6>"}}, 2), new String[][]{{"copySelf", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}}), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "7"}, {"getSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}}, 2), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "7"}, {"getSize", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"getHyperplane", "", "1"}, {"copySelf", "", "1"}, {"sameOrientationAs", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}), new String[][]{{"iterator", "", "2"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:6>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:6>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=-Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}}), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false), new String[][]{{"isParallelTo", "org.apache.commons.math3.geometry.euclidean.twod.Line", "0"}, {"reset", "org.apache.commons.math3.geometry.euclidean.twod.Vector2D,org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "7"}, {"intersection", "org.apache.commons.math3.geometry.euclidean.twod.Line", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Vector2D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:4>", "<sample:5>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=-Infinity, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:4>", "<sample:3>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>", "<sample:1>"}, false), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "2"}, {"getSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>", "<sample:4>"}, false), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "2"}, {"getSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "true"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}}, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:6>", "true"}}, 1), new String[][]{{"isEmpty", "", "4"}, {"lastIndexOf", "java.lang.Object", "2"}, {"indexOf", "java.lang.Object", "4"}, {"trimToSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:8>", "false"}}, 1), new String[][]{{"isEmpty", "", "4"}, {"lastIndexOf", "java.lang.Object", "2"}, {"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "boolean"}, new String[]{"<null>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:5>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=-1.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=!NullPointerException, isEmpty=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:4>", "false"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:6>", "false"}}, 3), new String[][]{{"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<null>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:7>"}, false, 0, null, 1), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"isEmpty", "", "6"}, {"getHyperplane", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getHyperplane", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getOriginOffset=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getHyperplane", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=1.0, getOriginOffset=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getHyperplane", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", actual.getClass().getName());
  assertEquals("{isDirect=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"getHyperplane", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2), new String[][]{{"getHyperplane", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Plane", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:5>", "false"}}, 1), new String[][]{{"getOriginOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getOriginOffset=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=1.0, getOriginOffset=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", actual.getClass().getName());
  assertEquals("{isDirect=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:0>"}}), new String[][]{{"isParallelTo", "org.apache.commons.math3.geometry.euclidean.twod.Line", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:0>"}}), new String[][]{{"getOffset", "org.apache.commons.math3.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:5>", "true"}}, 1), new String[][]{{"ensureCapacity", "int", "0"}, {"containsAll", "java.util.Collection", "2"}, {"add", "java.lang.Object", "2"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:7>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:3>", "false"}}, 1), new String[][]{{"ensureCapacity", "int", "0"}, {"listIterator", "", "3"}, {"next", "", "6"}, {"getStart", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:3>", "false"}}, 1), new String[][]{{"ensureCapacity", "int", "0"}, {"listIterator", "", "3"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Segment", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getSize", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "boolean"}, new String[]{"<null>", "false"}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:2>", "true"}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:4>", "true"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<null>", "true"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:0>", "true"}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean", "<sample:3>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}}, 3), new String[][]{{"isDirect", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=5.283185307179586, getOriginOffset=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:1>", "false"}}, 3), new String[][]{{"iterator", "", "4"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", new String[]{"org.apache.commons.math3.geometry.partitioning.SubHyperplane"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:1>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:1>", "true"}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:2>", "true"}}, 3), new String[][]{{"add", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:2>", "false"}}, 3), new String[][]{{"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}}, 1), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "4"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getHyperplane", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=5.283185307179586, getOriginOffset=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:0>", "true"}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:4>", "true"}}, 3), new String[][]{{"contains", "java.lang.Object", "7"}, {"indexOf", "java.lang.Object", "6"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.threed.SubLine", "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:3>", "false"}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.threed.SubLine", "intersection", "org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean", "<sample:6>", "true"}}, 3), new String[][]{{"addAll", "java.util.Collection", "2"}, {"set", "int,java.lang.Object", "2"}, {"getStart", "", "1"}, {"getSpace", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false), new String[][]{{"copySelf", "", "4"}, {"getHyperplane", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", actual.getClass().getName());
  assertEquals("{isDirect=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<null>"}}, 3), new String[][]{{"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "4"}, {"applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"isDirect", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 3), new String[][]{{"getBarycenter", "", "3"}, {"getSpace", "", "2"}, {"getDimension", "", "3"}, {"getSubSpace", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"getBarycenter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.Vector1D", actual.getClass().getName());
  assertEquals("{(NaN)} {getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=-Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:7>"}}, 2), new String[][]{{"wholeHyperplane", "", "6"}, {"getSize", "", "0"}, {"reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:7>"}}, 2), new String[][]{{"wholeHyperplane", "", "6"}, {"getSize", "", "0"}, {"reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "2"}, {"getSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}}, 2), new String[][]{{"toSubSpace", "org.apache.commons.math3.geometry.Vector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "intersection", new String[]{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}}, 1), new String[][]{{"revertSelf", "", "4"}, {"getNormal", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{-0.5403023059; -0; -0.8414709848} {getAlpha=-3.141592653589793, getDelta=-1.0, getNorm=1.0, getNorm1=1.3817732906760363, getNormInf=0.8414709848078965, getNormSq=1.0, getX=-0.5403023058681398, getY=-...#261#503626775", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}}, 1), new String[][]{{"sameOrientationAs", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:4>"}}, 2), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:5>"}}, 1), new String[][]{{"getSup", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 1), new String[][]{{"getSup", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 1), new String[][]{{"getSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}}), new String[][]{{"translateToPoint", "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "0"}, {"reset", "org.apache.commons.math3.geometry.euclidean.twod.Vector2D,double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=0.0, getOriginOffset=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:7>"}}), new String[][]{{"wholeSpace", "", "7"}, {"intersection", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "6"}, {"getHyperplane", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=-Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:3>"}}), new String[][]{{"translate", "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "7"}, {"reset", "org.apache.commons.math3.geometry.euclidean.threed.Plane", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.threed.Plane", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=-1.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 2), new String[][]{{"getHyperplane", "", "6"}, {"wholeHyperplane", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2), new String[][]{{"getHyperplane", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", actual.getClass().getName());
  assertEquals("{isDirect=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:5>", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}}, 3), new String[][]{{"side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}}, 3), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:3>"}}, 3), new String[][]{{"getRemainingRegion", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=-Infinity, getInf=!ClassCastException, getSize=!ClassCastException, getSup=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 8, new String[][]{}, 3), new String[][]{{"getRemainingRegion", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=0.0, getInf=-Infinity, getSize=Infinity, getSup=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"getAngle", "", "5"}, {"setOriginOffset", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.Line", actual.getClass().getName());
  assertEquals("{getAngle=5.283185307179586, getOriginOffset=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<null>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<null>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}}, 1), new String[][]{{"reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.twod.SubLine", actual.getClass().getName());
  assertEquals("{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}}, 1), new String[][]{{"getHyperplane", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", actual.getClass().getName());
  assertEquals("{isDirect=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 17, new String[][]{}), new String[][]{{"buildNew", "org.apache.commons.math3.geometry.partitioning.BSPTree", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getHyperplane", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}}, 3), new String[][]{{"getSegments", "", "5"}, {"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}}, 3), new String[][]{{"getSegments", "", "5"}, {"indexOf", "java.lang.Object", "0"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=0.0, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSize", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=-Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:7>", "<sample:3>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", ""}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:4>"}}, 2), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", new String[]{"org.apache.commons.math3.geometry.partitioning.Transform"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "copySelf", ""}}, 2), new String[][]{{"getRemainingRegion", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet", actual.getClass().getName());
  assertEquals("{getBoundarySize=-Infinity, getInf=!ClassCastException, getSize=!ClassCastException, getSup=!ClassCastException, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=NaN, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane", "org.apache.commons.math3.geometry.partitioning.Region"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "applyTransform", "org.apache.commons.math3.geometry.partitioning.Transform", "<sample:5>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 2), new String[][]{{"split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", ""}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getRemainingRegion", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"getTree", "boolean", "7"}, {"setAttribute", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.geometry.partitioning.BSPTree", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getSize=!ClassCastException, isEmpty=!ClassCastException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:2>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "isEmpty", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:1>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<null>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getSize=-Infinity, isEmpty=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "getSegments", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:6>", "<sample:7>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "reunite", "org.apache.commons.math3.geometry.partitioning.SubHyperplane", "<sample:1>"}}, 1), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getSize=Infinity, isEmpty=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.geometry.euclidean.twod.SubLine", "org.apache.commons.math3.geometry.euclidean.twod.SubLine", "split", new String[]{"org.apache.commons.math3.geometry.partitioning.Hyperplane"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "side", "org.apache.commons.math3.geometry.partitioning.Hyperplane", "<sample:4>"}, {"org.apache.commons.math3.geometry.euclidean.twod.SubLine", "buildNew", "org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region", "<sample:2>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
