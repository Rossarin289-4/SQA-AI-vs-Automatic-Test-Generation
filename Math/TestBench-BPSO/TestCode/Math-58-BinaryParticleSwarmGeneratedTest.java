package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "2.0000000000000004", "Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "Infinity", "-1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double"}, new String[]{"NaN", "0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-2.0000000000000004", "-1.985"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double"}, new String[]{"2.0", "NaN"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2147483647", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double"}, new String[]{"-1.0200000000000002", "-0.9930000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-1", "<sample:4>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"37", "<sample:4>", "<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "-1.7976931348623157E308", "2.0000000000000004"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2", "<sample:3>", "<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"8", "<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "Infinity", "2.0", "-0.043000000000000003"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.0000000000000002", "Infinity", "2.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:2>", "<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "-536870912", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:3>", "<empty>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"1", "<null>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "NaN", "1.0", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double", "double"}, new String[]{"2.0", "-0.9770000000000002", "2.0000000000000004"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2", "<sample:0>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "0.5000000000000001", "-1.7976931348623157E308", "4.9E-324"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2147483646", "<sample:2>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "4", "<sample:2>", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2147483648", "<sample:2>", "<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2", "<sample:4>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "3", "<sample:4>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2147483648", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double", "double"}, new String[]{"1.0000000000000002", "-Infinity", "4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double"}, new String[]{"-4.4942328371557893E307", "4.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.7976931348623157E308", "-2.0", "6.1000000000000005"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "1073741859", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2147483648", "<sample:4>", "<empty>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-2.0000000000000004", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.18", "1.0", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:5>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"524293", "<sample:4>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2", "<sample:0>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:0>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<null>", "<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:6>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "-2147483648", "<sample:4>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2050", "<sample:0>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"4", "<sample:1>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "0", "<sample:3>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:9>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "27.0", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:7>", "<empty>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2097150", "<null>", "<sample:2>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"4", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-1.0", "-Infinity", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-19", "<null>", "<sample:0>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-20", "<sample:1>", "<sample:2>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:6>", "<sample:2>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "0.38", "NaN", "-0.5000000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2147483648", "<sample:8>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:5>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:8>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "-536870913", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:5>", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:3>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2147482624", "<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "NaN", "2.0000000000000004", "2.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.20150000000000007", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"4", "<sample:0>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:3>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "Infinity", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "NaN", "-1.7976931348623157E308", "160.0"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"12", "<null>", "<sample:7>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.0", "2.0", "8.988465674311579E307"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"1", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-1.7976931348623157E308", "-0.49999999999999994"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"10", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:9>", "<sample:0>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"6", "<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-2.0000000000000004", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0000000000000002", "2.008"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "34", "<sample:3>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:6>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:1>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-1.7976931348623157E308", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:1>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:4>", "<empty>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.7976931348623157E308", "-2.0000000000000004"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-1.7976931348623157E308", "NaN", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:2>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:6>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:7>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:1>", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2", "<sample:8>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:7>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "Infinity", "1.7976931348623158E307"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483620", "<sample:9>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2147483648", "<sample:0>", "<null>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "81", "<sample:7>", "<sample:5>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "-17", "<null>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "3", "<sample:5>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2147483647", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
}
