package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=-1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:9>"}}, 1), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "distance", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:0>"}}, 2), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "0"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "1"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "0"}, {"getSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Euclidean3D", actual.getClass().getName());
  assertEquals("{getDimension=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:6>"}}, 1), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:6>"}}, 1), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:9>"}}, 1), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=1.0, getMatrix=[[0.7701511529340699, 0.595009839529386, -0.2298488470659301.., getQ0=0.8775825618903728, getQ1=-0.33900504942104487, getQ2=0.0, getQ3=0.33900504942104487}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:9>"}}, 1), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:8>"}}, 1), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, Inf.., getQ0=Infinity, getQ1=-Infinity, getQ2=-1.0, getQ3=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<null>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}, 1), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, NaN, NaN], [NaN, 1.0, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=-0.0, getQ2=-0.0, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 35, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 2), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 36, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 2), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 2), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 2), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 2), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 3), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}}, 3), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}}, 3), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}}, 3), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "1"}, {"getMatrix", "", "5"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}}, 3), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "1"}, {"getMatrix", "", "5"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:0>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "1"}, {"getAngle", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:1>"}}, 3), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:4>"}}, 1), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "7"}, {"getQ2", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1), new String[][]{{"revert", "", "7"}, {"getQ3", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:0>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}}, 2), new String[][]{{"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:0>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}}, 3), new String[][]{{"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}, 2), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:0>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}}, 2), new String[][]{{"getMatrix", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "distance", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}}, 1), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "4"}, {"getQ0", "", "7"}, {"getAxis", "", "2"}, {"negate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; (NaN)} {getAlpha=0.0, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=0.0, getY=0.0, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 3), new String[][]{{"getAngle", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 3), new String[][]{{"getAngle", "", "6"}, {"getQ0", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 3), new String[][]{{"getAngle", "", "6"}, {"getQ0", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.8775825618903728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 3), new String[][]{{"getAngle", "", "6"}, {"getQ0", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.8775825618903728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:1>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "distance", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=1.0, getMatrix=[[0.7701511529340699, 0.595009839529386, -0.2298488470659301.., getQ0=0.8775825618903728, getQ1=-0.33900504942104487, getQ2=0.0, getQ3=0.33900504942104487}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, Inf.., getQ0=Infinity, getQ1=-Infinity, getQ2=-1.0, getQ3=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Infinity, Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:6>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:6>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=-0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[1.0, Infinity, NaN], [-Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=-0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:1>"}}), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:1>"}}), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"getAxis", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:1>"}}), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:6>"}}), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:7>"}}), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [Infinity, Infinity, Infinity],.., getQ0=-Infinity, getQ1=-1.0, getQ2=0.0, getQ3=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<null>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:1>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}}), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "1"}, {"getMatrix", "", "5"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:0>"}}), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "1"}, {"getAngle", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:0>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "2"}, {"add", "org.apache.commons.math.geometry.Vector", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:1>"}}), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:1>"}}), new String[][]{{"getQ3", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}}), new String[][]{{"revert", "", "7"}, {"getQ3", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}}), new String[][]{{"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>"}, false), new String[][]{{"dotProduct", "org.apache.commons.math.geometry.Vector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:0>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Infinity, Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:9>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}), new String[][]{{"getSpace", "", "0"}, {"getDimension", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:5>"}, false), new String[][]{{"add", "double,org.apache.commons.math.geometry.Vector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0; 0; (NaN)} {getAlpha=0.0, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=0.0, getY=0.0, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}), new String[][]{{"getQ0", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "4"}, {"getQ0", "", "1"}, {"getAxis", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:5>"}, false), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>"}, false), new String[][]{{"getAlpha", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getDelta", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{-0; (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=-0.0, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getQ2", "", "3"}, {"revert", "", "1"}, {"getQ1", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 13, new String[][]{}), new String[][]{{"add", "org.apache.commons.math.geometry.Vector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{0.71; -0; -0.71} {getAlpha=-0.0, getDelta=-0.7853981633974484, getNorm=1.0, getNorm1=1.4142135623730951, getNormInf=0.7071067811865476, getNormSq=1.0000000000000002, getX=0.7071067811865476, getY=-0....#259#-907220719", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=1.0, getMatrix=[[0.7701511529340699, 0.595009839529386, -0.2298488470659301.., getQ0=0.8775825618903728, getQ1=-0.33900504942104487, getQ2=0.0, getQ3=0.33900504942104487}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); 0; -0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=0.0, getZ=-0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, Inf.., getQ0=Infinity, getQ1=-Infinity, getQ2=-1.0, getQ3=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "distance", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinity, Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:13>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:6>"}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:6>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}, 2), new String[][]{{"getQ2", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 3), new String[][]{{"getQ2", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}}, 3), new String[][]{{"revert", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:8>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:7>"}}, 2), new String[][]{{"revert", "", "1"}, {"getQ1", "", "7"}, {"getQ1", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:8>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}, 2), new String[][]{{"revert", "", "1"}, {"getQ1", "", "7"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:8>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:8>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}, 2), new String[][]{{"revert", "", "1"}, {"revert", "", "7"}, {"getMatrix", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:8>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}, 2), new String[][]{{"revert", "", "1"}, {"revert", "", "7"}, {"getMatrix", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:1>"}, false), new String[][]{{"getQ2", "", "1"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:4>"}, false), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "5"}, {"distance", "org.apache.commons.math.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:1>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:7>"}}), new String[][]{{"revert", "", "1"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:7>"}}, 1), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:1>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:7>"}}, 1), new String[][]{{"getQ0", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:1>"}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:9>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 1), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}, 3), new String[][]{{"getQ0", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:1>"}, false, 16, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}}, 1), new String[][]{{"getMatrix", "", "0"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<null>"}, false, 16, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:0>"}, false, 16, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}}, 1), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "0"}, {"distance", "org.apache.commons.math.geometry.Vector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:5>"}}, 3), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:5>"}}, 3), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "7"}, {"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:5>"}}, 3), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "7"}, {"isNaN", "", "5"}, {"crossProduct", "org.apache.commons.math.geometry.Vector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<null>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}}), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "7"}, {"isNaN", "", "7"}, {"crossProduct", "org.apache.commons.math.geometry.Vector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<null>"}}), new String[][]{{"getQ2", "", "7"}, {"getMatrix", "", "7"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}}, 3), new String[][]{{"getQ2", "", "7"}, {"getMatrix", "", "3"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:8>"}}, 3), new String[][]{{"getQ2", "", "7"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}, {"getAngle", "", "3"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:3>"}}), new String[][]{{"revert", "", "3"}, {"getMatrix", "", "2"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:10>"}}), new String[][]{{"getQ2", "", "7"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}, {"getAngle", "", "3"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:6>"}}, 2), new String[][]{{"getQ2", "", "7"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}, {"getAngle", "", "3"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}, 3), new String[][]{{"getQ2", "", "7"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}}, 2), new String[][]{{"getQ2", "", "7"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "5"}, {"distance1", "org.apache.commons.math.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}}, 2), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "7"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "5"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:7>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}}), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "7"}, {"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "3"}, {"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "5"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isNaN", "", "5"}, {"crossProduct", "org.apache.commons.math.geometry.Vector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}), new String[][]{{"isInfinite", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:11>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}), new String[][]{{"normalize", "", "5"}, {"scalarMultiply", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 2), new String[][]{{"orthogonal", "", "6"}, {"crossProduct", "org.apache.commons.math.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}), new String[][]{{"getZero", "", "2"}, {"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}, 2), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "3"}, {"distance", "org.apache.commons.math.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8775825618903728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8775825618903728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=1.0, getMatrix=[[0.7701511529340699, 0.595009839529386, -0.2298488470659301.., getQ0=0.8775825618903728, getQ1=-0.33900504942104487, getQ2=0.0, getQ3=0.33900504942104487}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:6>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, Inf.., getQ0=Infinity, getQ1=-Infinity, getQ2=-1.0, getQ3=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:6>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8775825618903728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:6>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, NaN, NaN], [NaN, 1.0, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=-0.0, getQ2=-0.0, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<null>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<null>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.33900504942104487", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=1.0, getMatrix=[[0.7701511529340699, 0.595009839529386, -0.2298488470659301.., getQ0=0.8775825618903728, getQ1=-0.33900504942104487, getQ2=0.0, getQ3=0.33900504942104487}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:6>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, Inf.., getQ0=Infinity, getQ1=-Infinity, getQ2=-1.0, getQ3=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:6>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, NaN, NaN], [NaN, 1.0, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=-0.0, getQ2=-0.0, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8775825618903728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:3>"}}), new String[][]{{"getNorm", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:6>"}}, 2), new String[][]{{"getNorm", "", "3"}, {"negate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:6>"}}, 2), new String[][]{{"getNorm", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:2>"}}, 2), new String[][]{{"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 2), new String[][]{{"applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinity, Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Infinity, Infinity]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ1", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "distance", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:4>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:0>"}}, 3), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "4"}, {"getNorm1", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=1.0, getMatrix=[[0.7701511529340699, 0.595009839529386, -0.2298488470659301.., getQ0=0.8775825618903728, getQ1=-0.33900504942104487, getQ2=0.0, getQ3=0.33900504942104487}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:9>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 3), new String[][]{{"revert", "", "4"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1), new String[][]{{"revert", "", "4"}, {"getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.9394318063821583, 0.6917182407210458, 1.202160847207635]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=1.0, getMatrix=[[0.7701511529340699, 0.595009839529386, -0.2298488470659301.., getQ0=0.8775825618903728, getQ1=-0.33900504942104487, getQ2=0.0, getQ3=0.33900504942104487}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:7>"}, false), new String[][]{{"orthogonal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); 0} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2), new String[][]{{"orthogonal", "", "7"}, {"getY", "", "4"}, {"add", "org.apache.commons.math.geometry.Vector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2), new String[][]{{"orthogonal", "", "7"}, {"getY", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 2), new String[][]{{"orthogonal", "", "7"}, {"getY", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:9>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:5>"}}, 1), new String[][]{{"subtract", "org.apache.commons.math.geometry.Vector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 16, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<null>"}}, 1), new String[][]{{"getDelta", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<null>"}}, 1), new String[][]{{"getDelta", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<null>"}}, 3), new String[][]{{"getAlpha", "", "4"}, {"distance", "org.apache.commons.math.geometry.Vector", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Vector3D", actual.getClass().getName());
  assertEquals("{(NaN); (NaN); (NaN)} {getAlpha=NaN, getDelta=NaN, getNorm=NaN, getNorm1=NaN, getNormInf=NaN, getNormSq=NaN, getX=NaN, getY=NaN, getZ=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}}, 3), new String[][]{{"getAlpha", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"revert", "", "0"}, {"revert", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}}, 3), new String[][]{{"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:1>"}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:3>"}}), new String[][]{{"applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "2"}, {"getQ2", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:1>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Rotation"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<null>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.Rotation", actual.getClass().getName());
  assertEquals("{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=NaN, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:4>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:5>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}}, 3), new String[][]{{"negate", "", "7"}, {"dotProduct", "org.apache.commons.math.geometry.Vector", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ0", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", new String[]{"org.apache.commons.math.geometry.euclidean.threed.Vector3D"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"getSpace", "", "1"}, {"getDimension", "", "4"}, {"getSubSpace", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.geometry.euclidean.twod.Euclidean2D", actual.getClass().getName());
  assertEquals("{getDimension=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=1.0, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyInverseTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:2>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ2", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:3>"}}, 2), new String[][]{{"getQ2", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[1.0, -Infinity, NaN], [Infinity, 3.0, Infinity], [NaN, Inf.., getQ0=-1.0, getQ1=0.0, getQ2=1.0, getQ3=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<null>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", "org.apache.commons.math.geometry.euclidean.threed.RotationOrder", "<sample:0>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "revert", ""}}, 2), new String[][]{{"getQ2", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=3.141592653589793, getMatrix=[[1.0, NaN, NaN], [NaN, Infinity, -Infinity], [NaN, -Infinit.., getQ0=0.0, getQ1=1.0, getQ2=Infinity, getQ3=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngle", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[0.5403023058681398, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN,.., getQ0=0.8775825618903728, getQ1=-0.0, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getQ3", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[NaN, NaN, NaN], [NaN, NaN, NaN], [NaN, NaN, NaN]], getQ0=0.8775825618903728, getQ1=NaN, getQ2=NaN, getQ3=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getMatrix", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAxis", ""}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity], [-Infinity, NaN, 3.0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAngle=NaN, getMatrix=[[Infinity, -Infinity, NaN], [-Infinity, Infinity, Infinity].., getQ0=1.0, getQ1=Infinity, getQ2=-Infinity, getQ3=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.geometry.euclidean.threed.Rotation", "org.apache.commons.math.geometry.euclidean.threed.Rotation", "getAngles", new String[]{"org.apache.commons.math.geometry.euclidean.threed.RotationOrder"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:10>"}, {"org.apache.commons.math.geometry.euclidean.threed.Rotation", "applyTo", "org.apache.commons.math.geometry.euclidean.threed.Vector3D", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException", thrown.getClass().getName());
 }
}
