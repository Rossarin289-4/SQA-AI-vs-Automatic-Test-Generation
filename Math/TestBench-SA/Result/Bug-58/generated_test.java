package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<null>", "<sample:1>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double", "double"}, new String[]{"2.0", "0.0", "1.7976931348623157E308"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "NaN"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2", "<sample:6>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double", "double"}, new String[]{"NaN", "-1.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double", "double"}, new String[]{"NaN", "-1.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:0>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double"}, new String[]{"NaN", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:2>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double"}, new String[]{"NaN", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:2>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "NaN", "0.0", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double"}, new String[]{"NaN", "-0.8999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double"}, new String[]{"NaN", "-0.8999999999999999"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2147483648", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.0", "NaN", "-1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:4>", "<null>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:4>", "<null>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:3>", "<null>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:3>", "<null>"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "2.0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "10", "<null>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<null>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-1.7976931348623157E308", "-1.7976931348623157E308", "Infinity"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "0.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "2.0", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "-20.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "-20.000000000000004"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.34", "0.54"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "-20.000000000000004"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.34", "0.54"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "-20.000000000000004"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.34", "0.54"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0", "-Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-1.0", "-20.000000000000004"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.34", "0.54"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-19.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-2.9000000000000004", "-1.0", "-20.000000000000004"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.3170000000000002", "0.54"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-19.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-2.9000000000000004", "-1.0", "-20.000000000000004"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.3170000000000002", "0.54"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-19.0", "1.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-2.9000000000000004", "-1.0", "-20.000000000000004"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.3170000000000002", "0.54"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-19.0", "0.9999999999999999"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-2.9000000000000004", "1.9000000000000004", "-20.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.3170000000000004", "0.54"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 23, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<null>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "0.54", "1.0", "1.34"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "-2147483648", "<sample:2>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:0>", "<empty>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-1.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "3", "<sample:1>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:7>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "0.54", "0.67", "0.054000000000000006"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:7>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "2.0", "-20.000000000000004", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:1>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:0>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:4>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<null>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"double", "double", "double"}, new String[]{"0.0", "-20.000000000000004", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2147483647", "<sample:6>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:8>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:4>", "<null>"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:3>", "<null>"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.7976931348623157E308", "1.0", "1.34"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2", "<sample:6>", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"10", "<sample:5>", "<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:9>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:8>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.0", "1.0", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.7976931348623157E308", "0.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-1", "<sample:4>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"0", "<sample:0>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "1", "<null>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:5>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "-1", "<null>", "<null>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.34", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-46", "<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.0", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-46", "<sample:4>", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.0", "2.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-46", "<sample:4>", "<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.0", "2.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-46", "<sample:4>", "<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.0", "2.0", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"60", "<sample:3>", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:3>", "<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:3>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:8>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-1", "<sample:4>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "1.34", "1.0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-3", "<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "-1", "<sample:7>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:5>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "Infinity", "0.54", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:5>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "Infinity", "0.54", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"0", "<null>", "<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.0", "1.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<null>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:4>", "<null>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:4>", "<null>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2147483647", "<sample:4>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-Infinity", "1.34", "0.54"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "NaN", "1.7976931348623157E308", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-1.0", "NaN", "0.54"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:9>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2147483647", "<sample:3>", "<empty>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:3>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "Infinity", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "5.4", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:3>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "5.4", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:5>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.4", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:5>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.4", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:5>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-Infinity"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.4", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-20.000000000000004"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000002", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-20.000000000000004"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000002", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-10.000000000000002"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000002", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-10.000000000000002"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000002", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-10.000000000000002"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000002", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-10.000000000000002"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000002", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:6>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-10.000000000000002"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000003", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:3>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-10.000000000000002"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000003", "0.054000000000000006"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:4>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-10.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000003", "0.027000000000000003"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:3>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "10.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000003", "0.027"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:2>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-100.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-59.00000000000003", "0.027"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-100.34"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-5.900000000000003", "0.21599999999999997"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:3>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-100.34"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-12.000000000000005", "0.432"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:3>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-100.34"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-12.000000000000005", "0.432"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:7>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-Infinity", "-100.34"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-12.000000000000005", "0.432"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:0>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "Infinity", "16.945999999999998"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-10.000000000000002", "0.432"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:5>", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:7>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "Infinity", "-0.049"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-9.96", "0.10800000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:0>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "2.0", "2.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-40.08500000000001", "-0.432"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<empty>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 16, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "clearObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "2.0", "-0.98"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "2.0", "-0.98"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<null>", "<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "0", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<empty>"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:2>", "<empty>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:4>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:3>", "<null>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-40.08500000000001", "-10.0"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-Infinity", "10.0", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:6>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "-40.08500000000001", "0.027000000000000003", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"3", "<sample:2>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:4>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-1073741800", "<sample:0>", "<empty>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"0", "<null>", "<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "0.027000000000000003", "NaN", "-0.383"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"16396", "<sample:0>", "<empty>"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:7>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.7976931348623157E308", "1.34", "-20.000000000000004"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"<sample:7>", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-100.0", "-0.432"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"2", "<sample:7>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "0.027", "0.21599999999999997", "0.10800000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<sample:2>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "1.7976931348623157E308", "NaN", "0.54"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"1", "<sample:9>", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "-10.0", "1.34"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "double[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<empty>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:5>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-10", "<sample:0>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"3", "<null>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2", "<sample:2>", "<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2147483647", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "NaN", "4.9E-324"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"60", "<sample:8>", "<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-2", "<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<null>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"-1073741825", "<sample:3>", "<sample:2>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"int", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction", "double[]"}, new String[]{"3", "<null>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2147483647", "<sample:2>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "<sample:4>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "2", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "-1", "<sample:7>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "80.18400000000001", "1.0", "0.05400000000000001"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "0.0216", "2.0"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "0.21600000000000008", "16.945999999999998", "-46.022999999999996"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double", "6.75E-4", "2.0000000000000013"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", new String[]{"org.apache.commons.math.optimization.fitting.WeightedObservedPoint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getObservations=[null, null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", "int,org.apache.commons.math.analysis.ParametricUnivariateRealFunction,double[]", "0", "<sample:4>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "getObservations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math.optimization.fitting.WeightedObservedPoint;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=[null]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.fitting.GaussianFitter", "org.apache.commons.math.optimization.fitting.GaussianFitter", "fit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:7>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "<sample:7>"}, {"org.apache.commons.math.optimization.fitting.GaussianFitter", "addObservedPoint", "double,double,double", "0.54", "Infinity", "0.54"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getObservations=?}", SearchInputFactory_scaffolding.receiverState());
 }
}
