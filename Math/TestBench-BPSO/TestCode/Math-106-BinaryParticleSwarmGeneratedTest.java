package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<empty>", "<sample:2>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "i a,b,c", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.5e300[1,2]"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "2020-02-30S25:61:61", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 / 1 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-0-30S25:61:61Title", "<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345678-0.0", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", " 1.25", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-00/a/b", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1.1234567890123356", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "2147483648 1/25", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2030-0/-01", "<sample:5>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:key>", "<sample:3>", "<sample:6>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"parse", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"--"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setWholeFormat", "java.text.NumberFormat", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getAvailableLocales", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getAvailableLocales", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:4>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5 / 6 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"11.5f"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@6b89", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 / 1 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"P", "<sample:9>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12234567890123456", "<null>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:4>"}}, 2), new String[][]{{"isParseIntegerOnly", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setDenominatorFormat", "java.text.NumberFormat", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:3>"}}, 2), new String[][]{{"setCurrency", "java.util.Currency", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getNumeratorFormat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setRoundingMode", "java.math.RoundingMode", "2"}, {"getPositivePrefix", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:1>", "<sample:1>", "<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", ".51E-5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"http://example.com/a?b=c\n", "<sample:5>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<b:false>", "<sample:3>", "<sample:7>"}}, 2), new String[][]{{"append", "float", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 1 / 20.0 {length=10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"PT1H0", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<sample:1>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:4>", "<sample:1>"}}, 3), new String[][]{{"setMinimumFractionDigits", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 / 1 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 1), new String[][]{{"getGroupingSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1e100xFFFFFFFF", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "0.5d", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:4>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 0 / 1 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"format", "double", "5"}, {"isDecimalSeparatorAlwaysShown", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"parse", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getCurrency", "", "4"}, {"getDisplayName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Euro", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<null>"}}, 2), new String[][]{{"getDecimalFormatSymbols", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormatSymbols", actual.getClass().getName());
  assertEquals("{getCurrencySymbol=\u20ac, getDecimalSeparator=,, getDigit=#, getExponentSeparator=E, getGroupingSeparator=., getInfinity=\u221e, getInternationalCurrencySymbol=EUR, getMinusSign=-, getMonetaryDecimalSeparator=...#281#-689302442", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "cPT1H", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 / 3 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5e300", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"20.20-01-01"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 3), new String[][]{{"getMaximumFractionDigits", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getAvailableLocales", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<b:false>", "<sample:4>", "<sample:2>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1L", "<sample:0>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:3>"}}, 3), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample2 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setCurrency", "java.util.Currency", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:>", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isParseBigDecimal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"setParseBigDecimal", "boolean", "4"}, {"formatToCharacterIterator", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=1, getIndex=0, getRunLimit=1, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "Titlde", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getPositivePrefix", "", "4"}, {"format", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:>", "<sample:5>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-2147483648>", "<sample:0>", "<sample:5>"}, false, 0, null, 3), new String[][]{{"insert", "int,long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-92233720368547758072\u00a0147\u00a0483\u00a0648 0 / 1 {length=39}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:4>", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:0>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5 / 6 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-2147483648>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<d:0.15>", "<sample:3>", "<sample:4>"}}, 2), new String[][]{{"capacity", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xFFFFFFFFF1E-5", "<sample:8>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xF", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"21474836481e10", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getAvailableLocales", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:kez>", "<empty>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"applyLocalizedPattern", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2147483647, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=0, getMultiplier=1, getNegativePrefix=-, getNegativeSuf...#380#1579668549", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"getPositiveSuffix", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"getWholeFormat", "", "0"}, {"isParseBigDecimal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "tu{", "<sample:1>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-1>", "<empty>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 0 / 1 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<null>", "<null>", "<sample:1>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "[2,2]"}}), new String[][]{{"toPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#,##0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i a,b,c", "<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"T\n", "<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-20>", "<sample:3>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"getDenominatorFormat", "", "2"}, {"clone", "", "3"}, {"getNegativeSuffix", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1e10", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:3.0>", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("3 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:4>", "<sample:5>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:0>", "<sample:6>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:2>"}}), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true), new String[][]{{"parse", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"00", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:5>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"applyLocalizedPattern", "java.lang.String", "2"}, {"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"clone", "", "0"}, {"setNumeratorFormat", "java.text.NumberFormat", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xFaFFFFFFF", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"getDenominatorFormat", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"setWholeFormat", "java.text.NumberFormat", "6"}, {"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"!", "<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"getGroupingSize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"010{\"a\":1}", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false), new String[][]{{"getMinimumFractionDigits", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:W>", "<sample:2>", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=1, getIndex=0, getRunLimit=1, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample-1 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-1>", "<sample:3>", "<null>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<sample:4>", "<sample:1>"}}), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("9,223,372,036,854,775,807 {length=25}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"010h"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5c5c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getDecimalFormatSymbols", "", "2"}, {"setMinusSign", "char", "2"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormatSymbols", actual.getClass().getName());
  assertEquals("{getCurrencySymbol=\u00a4, getDecimalSeparator=., getDigit=#, getExponentSeparator=E, getGroupingSeparator=,, getInfinity=\u221e, getInternationalCurrencySymbol=XXX, getMinusSign=a, getMonetaryDecimalSeparator=...#281#-1295194314", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getPositivePrefix", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:4>"}}), new String[][]{{"isParseBigDecimal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true), new String[][]{{"parse", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:4>", "<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 / 1 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getMinimumFractionDigits", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 / 3 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"11E-5", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:0>"}}), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "1"}, {"insert", "int,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "1"}, {"insert", "int,float", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sInfinityample1 0 / 1 {length=21}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}), new String[][]{{"replace", "int,int,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 / 1 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:1>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5 / 6 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1e10a,b,c", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:4>", "<sample:0>"}, false, 5, new String[][]{}), new String[][]{{"insert", "int,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<null>"}}), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "5"}, {"append", "double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0-1.0 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<sample:3>", "<sample:5>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "2020-01-01", "<sample:3>"}}), new String[][]{{"codePointCount", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false), new String[][]{{"setCurrency", "java.util.Currency", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"getRoundingMode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.math.RoundingMode", actual.getClass().getName());
  assertEquals("HALF_EVEN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2147483648", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:4>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.123456789201234567", "<sample:4>"}}), new String[][]{{"append", "double", "7"}, {"append", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 / 30.03 {length=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i a,b,c123456789012345678901234567890", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "0Cx1F", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-52>", "<sample:4>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "", "<sample:10>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "-0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-52 0 / 1 {length=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "H"}}), new String[][]{{"isParseBigDecimal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"getMaximumFractionDigits", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"getDecimalFormatSymbols", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormatSymbols", actual.getClass().getName());
  assertEquals("{getCurrencySymbol=$, getDecimalSeparator=., getDigit=#, getExponentSeparator=E, getGroupingSeparator=,, getInfinity=\u221e, getInternationalCurrencySymbol=USD, getMinusSign=-, getMonetaryDecimalSeparator=...#281#-1806874468", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:1>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "+0"}}), new String[][]{{"append", "char[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 0 / 10 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:8>"}}), new String[][]{{"getNegativePrefix", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"123456789012345678901234567890", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"parse", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:0.75>", "<sample:0>", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "{\"a\":1}", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("3 / 4 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"getNumeratorFormat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1 0 / 1 {length=13}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-0E1", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"020-02-", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:1>", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i a,b,b", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:6>", "<sample:2>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30S25:61:61", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getNumeratorFormat", "", "0"}, {"setDecimalFormatSymbols", "java.text.DecimalFormatSymbols", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:0>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getMaximumIntegerDigits", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"parse", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 / 1 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"--1", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8 / 9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"11.12345678901234567", "<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"clone", "", "5"}, {"getDenominatorFormat", "", "2"}, {"setPositivePrefix", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#372#1730721873", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:5>", "<sample:8>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 / 1 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 / 3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:3>"}}), new String[][]{{"getPositiveSuffix", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:1>", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.5e300{\"a\":1}", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 / 1 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}), new String[][]{{"getNegativeSuffix", "", "2"}, {"format", "double,java.lang.StringBuffer,java.text.FieldPosition", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:6>"}}, 3), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "7"}, {"format", "double,java.lang.StringBuffer,java.text.FieldPosition", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-\u221e {length=2}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "-01", "<sample:0>"}}), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("3 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 2), new String[][]{{"format", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getNumeratorFormat", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"format", "java.lang.Object", "1"}, {"format", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9.223.372.036.854.775.807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:2>"}}), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 0 / 1 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"format", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-\u221e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setParseIntegerOnly", "boolean", "6"}, {"getNegativeSuffix", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("3 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<empty>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"getDecimalFormatSymbols", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormatSymbols", actual.getClass().getName());
  assertEquals("{getCurrencySymbol=\u20ba, getDecimalSeparator=,, getDigit=#, getExponentSeparator=E, getGroupingSeparator=., getInfinity=\u221e, getInternationalCurrencySymbol=TRY, getMinusSign=-, getMonetaryDecimalSeparator=...#281#-202726929", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+1http://xample.com/a?b=c", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "5"}, {"lastIndexOf", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 / 1 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"format", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"parse", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true), new String[][]{{"format", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"parse", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"format", "double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getMinimumFractionDigits", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=5, getIndex=0, getRunLimit=5, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "1.5e300[I,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"ab ", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "0x123456789Hello, World"}}, 1), new String[][]{{"setMinimumFractionDigits", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123456789", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:bb>", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"parseObject", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 2), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "7"}, {"substring", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-5-30S25:61:61Title", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:4>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"format", "double,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getWholeFormat", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"http://examplle.com/a?b=cTITLE", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"parse", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-082-30S25:61:61", "<sample:4>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 / 3 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30S25:61:61--1", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<null>", "<sample:4>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/a/c", "<null>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".5\t0", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:6>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:2>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 / 3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 / 1 {length=6}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:7>", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 / 3 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=7, getIndex=0, getRunLimit=7, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "-1", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"clone", "", "2"}, {"format", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"+1", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"htup://example.com/a?b=c1.12345678901234567", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"setCurrency", "java.util.Currency", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"toPattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#,##0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"format", "double,java.lang.StringBuffer,java.text.FieldPosition", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"parse", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:9>", "<sample:2>", "<sample:3>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample7 / 8 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:4>", "<sample:0>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:3>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{" . 1.25", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5e87", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:-3.77>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 3), new String[][]{{"append", "float", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-3 77 / 100-1.0 {length=15}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<null>", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:9>", "<sample:1>", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("7 / 8 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:0>", "<sample:9>"}, false, 0, null, 1), new String[][]{{"delete", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 0/ 1 {length=6}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:2>", "<sample:1>", "<null>"}}, 1), new String[][]{{"toLocalizedPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#,##0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:0>", "<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 0 / 1 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<sample:3>", "<sample:7>"}, false, 7, new String[][]{}, 1), new String[][]{{"append", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 0 / 10.0 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=5, getIndex=0, getRunLimit=5, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:2>", "<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 / 1 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"format", "double,java.lang.StringBuffer,java.text.FieldPosition", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:2>", "<sample:5>"}, false, 0, null, 3), new String[][]{{"deleteCharAt", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("ample0 / 1 {length=10}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.12345688", "<sample:0>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:9>", "<sample:0>", "<sample:5>"}, false, 5, new String[][]{}, 1), new String[][]{{"append", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("7 / 8true {length=9}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-1>", "<sample:3>", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 2), new String[][]{{"append", "java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 0 / 1 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"--1", "<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:9>", "<sample:0>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("5 / 6 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:0.772>", "<sample:1>", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:8>"}}, 2), new String[][]{{"substring", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
}
