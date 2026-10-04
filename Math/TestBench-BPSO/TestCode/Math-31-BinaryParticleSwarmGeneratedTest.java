package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getA", new String[]{"int", "double"}, new String[]{"4", "0.0"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"1.0737418235000001E9", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.9999999999999999", "4"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.002", "2.147483647E9", "-1"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "-1.7976931348623158E307", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"NaN", "4.294967294E9"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-7.190772539449263E307"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"2.1474836411E9"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-5.198", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "-2147483648", "-3.5953862697246315E307"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"10", "0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "Infinity"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"4", "0.5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"-3.5999999900000006", "-1.5999999900000001", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2130706432", "-1.7976931348623158E307"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483602", "2.147483647E9"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-254", "-1.0737418235000001E9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.368709125E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"NaN", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getA", new String[]{"int", "double"}, new String[]{"1073741823", "-1.7976931348623158E307"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483647", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.002", "2.0E-50"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9989996663329104", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"-1.7976931348623158E307", "-2.0000000000000003E-50", "-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "2147483647", "-8.988465674311578E305"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"10", "-1.7976931348623157E308"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-28", "2.1474836469999998E9"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "Infinity", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.567550195925925E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"1.0", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-Infinity"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"2.147483647E9", "Infinity", "0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"1", "-Infinity"}, false, 2, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.7976931348623155E308", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"1.0", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "1.0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.2500000001164153", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-2.2", "-1048568"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-1.0E-50"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-2.2"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.8914142342901468", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-1073741824", "1.0"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getA", new String[]{"int", "double"}, new String[]{"2147483576", "-1.0E-50"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-17", "8.988465674311579E307"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"4", "0.001"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0E-8"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"1.0E-50", "-1.0", "-2147483648"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "2.0"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-1.0", "6.2"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483602", "Infinity"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"NaN", "2147483646"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483647", "-4.351"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getA", new String[]{"int", "double"}, new String[]{"2147483647", "2.1474836470000002E9"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "5.3687091152000004E8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"2.147483647E9", "8"}, false, 7, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "54", "2.1474836470000004E10"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-8.988465674311579E306"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"8.988465674311579E307", "-1073741824"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"1.0E-50", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"10", "2147483647"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.158278823333334E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"1.0E-50", "2.147483647E8"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-1", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"-1.7976931348623158E307", "-1.0E-50", "8"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "2.0E-50", "0.0", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"2.0000000000000003E-50", "9"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.001", "2.0000000000000003E-51"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "-1.7976931348623158E307", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9994999166249736", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"9", "-10.0"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "4.9E-324", "4.2949672912E9", "-2097136"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6666666666666667", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"8", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "-1.0737418235000001E9", "2.2000000000000006", "18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2147483648", "1.0737418235000001E9"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "-9", "2.1474836475099998E9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.6843545600000006E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"2.14748364651E9", "4.2", "2147483647"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.000000008381902", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.9999999999999999", "1.7976931348623157E308", "20"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0E-8"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0E-50"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-8.988465674311579E306"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"1.7976931348623157E308", "2.0000000000000003E-50", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0", "Infinity", "32"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ConvergenceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4426950422905933", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-5.3687091175000006E8"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.670831053728633E7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "5.0E-51"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.2500000005820767E-51", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"2.1474836470000002E9", "1.7976931348623158E307"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0737418225000001E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"4.9E-324"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-3.2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-2.147483647E9", "1.7976931348623157E308"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418245E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-23.0"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.237133571730392", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"1.0000000000000002E-8", "4"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "0.0020000000000000005", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.0020000000000000005", "0.054"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "1.0E-8", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"2.0000000000000005E-50", "4"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "Infinity"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-983040", "1.0737418235000001E9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"9.999999999999999E-9", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "2.1474836469999998E9", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.5", "Infinity"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0E-50"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-1.1"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "1073741844", "-2.0E-50"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "-1.0E-50", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4826049764583549", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"0.41000000000000003", "20"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7770556438763379", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "1.0737418235E8"}, false, 5, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-1.7976931348623157E308", "-0.254"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-8.98846567431158E306", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.684354555E7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "NaN", "-Infinity"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483647", "-2.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7213475211452969", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"1.0E-50", "1.0E-9"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.9999999999999999", "0.44000001"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "0", "2.4000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"18.00000001", "2.1474836513E9"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.000000005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "-1.797693134862316E307"}, false, 5, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "0", "-1.0E-50"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "NaN", "2147483646"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-56.0", "1.044"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.709677419354839", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "-0.002"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.000000002328307E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-2", "-0.002"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "0", "2.2"}, {"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-2139095040", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "-0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "58.8", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.249999999650754", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-1.0", "1.0E-8"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.442695042290593", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"0.41000000000000003", "0.002"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7771046613569841", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "-0.002"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.000000002328307E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"16383", "5.0E-52"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-1.7976931348623157E308", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.2497711041933713E-52", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-262134", "2.0000000000000003E-50"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.000019074286718E-51", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-1.0"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "2147483647", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.442695042290593", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"11", "0.002"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "65545", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.6363636363636367E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-1.0"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.442695042290593", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"0.0019999999999999996", "0.9999999999999999", "16777216"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "2147483647", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"5.0E-50", "4.294967294E9"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"5.0E-9"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999975", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"-1073741824", "1.0737418235000001E9"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.6843545512500003E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"-2.2", "2.147483647E9", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "4", "-0.498"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-3.0", "2147483647"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.16404255831952", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"2.147483647E9", "1.7976931348623157E308", "10"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-1", "1.0E-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0737418225E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-0.2"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "1.0E-8", "-1.7976931348623158E307", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0969629895795905", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-38.0", "1.7976931348623155E308"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "1.0", "62.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("20.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-51.1", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "2.0E-51"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("12.92635163508482", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"0.2"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-1048568", "-0.53"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8962840236686394", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-27.0"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "2.1474836470000002E9", "-34"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.102743992798109", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"-1.7976931348623158E307", "1.7976931348623157E308", "2147483646"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "NaN", "1.0E-4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E306", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-0.7000000000000001", "0.9999999999999999"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double"}, new String[]{"-43.998", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-16", "5.3687091175000006E8"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("22.999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"-1.0", "1.0", "2147483647"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-0.9999999999999999", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "1.0000000000000002E-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4426950422905933", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"9.999999999999999E-9"}, false, 1, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "-2147483648", "-39.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"0.004", "2147483647"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.997998663994656", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"59", "1.9999999999999997E-8"}, false, 5, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double", "-1.7976931348623155E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.745762711864406E-9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-0.045"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0223349420122279", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"1.0000000000000001E-7"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999499999991", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"-0.75"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double,int", "-Infinity", "-1.0", "9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3402052188315936", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double"}, new String[]{"0.004"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "-2", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.997998663994656", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "double", "int"}, new String[]{"1.0E-50", "1.0737418235000002E9", "2147483134"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "getB", "int,double", "10", "0.002"}, {"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "-4.4942328371557893E307", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"2147483647", "8.988465674311579E307"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"-2.2000000000000006", "2147483647"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.891414234290146", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "evaluate", new String[]{"double", "int"}, new String[]{"0.0020000000000000005", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,int", "Infinity", "-16344"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9989996663329995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.util.ContinuedFraction", "org.apache.commons.math3.special.Beta$1", "getB", new String[]{"int", "double"}, new String[]{"10", "-2.2"}, false, 0, new String[][]{{"org.apache.commons.math3.util.ContinuedFraction", "evaluate", "double,double", "-1.7976931348623158E307", "0.05999999999999999"}, {"org.apache.commons.math3.util.ContinuedFraction", "getA", "int,double", "-54", "0.00400001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7333333333333333", String.valueOf(actual));
 }
}
