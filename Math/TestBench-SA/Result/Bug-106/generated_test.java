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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"11--06]"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "2020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"22020-00-30S26:61;:"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:6>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:3>", "<sample:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 15, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:5>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:5>", "<null>", "<sample:1>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ba3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "1.25", "<sample:1>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "{a b", "<sample:1>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-1>", "<empty>", "<sample:5>"}}, 1), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "3"}, {"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "7"}, {"offsetByCodePoints", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<empty>", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "2\r9/+3\""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<null>"}}, 1), new String[][]{{"charAt", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:9>", "<empty>", "<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "2\r9/,3\""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<null>"}}), new String[][]{{"charAt", "int", "5"}, {"insert", "int,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("7 / 1.08 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1\r9/-1"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5e300", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "Hello, World", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5eBB001a,b,c", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "Hello, World", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5eBB000a,b,c<a>b</a>", "<null>"}, false, 11, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "Hello, World", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"aalaaaaaaaaaaa`aaaaaaa-aaaaaaaa", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:3>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "http://example.com/a?b=c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{" / ", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:a>", "<sample:2>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:3>", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 / 3 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<null>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<null>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "\n"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "-1", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<sample:3>", "<sample:10>"}, false, 8, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "35"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:3>", "<sample:10>"}, false, 8, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "35"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 3), new String[][]{{"append", "java.lang.CharSequence", "3"}, {"reverse", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("elpmas6 / 5 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<sample:3>", "<sample:5>"}, false, 7, new String[][]{}, 3), new String[][]{{"append", "java.lang.CharSequence", "3"}, {"reverse", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("elpmas1 / 0 1 {length=13}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:0>", "<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:4>", "<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<null>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:2>"}}, 3), new String[][]{{"insert", "int,char", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:4>", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<null>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<empty>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{" / ", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:2>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 3), new String[][]{{"getMultiplier", "", "2"}, {"isParseIntegerOnly", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 3), new String[][]{{"getMultiplier", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 / 3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a 6b\t1.12345678901234567", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a 6b\t1.12345678901234567", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1E- "}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5f", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5f", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-01-01", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2010-01-01", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:31>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "0x1F"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<null>"}}, 2), new String[][]{{"append", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample31 0 / 1true {length=18}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:31>", "<empty>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "0x1F"}}, 2), new String[][]{{"append", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("31 0 / 1true {length=12}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:0>", "<sample:2>"}, false, 0, null, 1), new String[][]{{"append", "char", "3"}, {"append", "java.lang.Object", "3"}, {"append", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 / 302 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 / 1 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "true", "<null>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "2147483648", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:1>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1.12345678901234567", "<sample:2>"}}, 3), new String[][]{{"append", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<null>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "1.12345678901234567", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".5", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ba3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/5", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\t", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5f", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"applyPattern", "java.lang.String", "4"}, {"format", "double,java.lang.StringBuffer,java.text.FieldPosition", "7"}, {"append", "float", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("00.0 {length=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"setParseBigDecimal", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#370#1987545849", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\n", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "1", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/a/b", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "1", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"toLocalizedPattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#,##0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getAvailableLocales", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{" ", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{";W", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(";", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}), new String[][]{{"getCurrency", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("XXX {getCurrencyCode=XXX, getDefaultFractionDigits=-1, getDisplayName=Unknown Currency, getNumericCode=999, getNumericCodeAsString=999, getSymbol=XXX}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "aaaaaaaacaaaaaaaaaaaaaaaaaaaaa"}}), new String[][]{{"getCurrency", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("USD {getCurrencyCode=USD, getDefaultFractionDigits=2, getDisplayName=US Dollar, getNumericCode=840, getNumericCodeAsString=840, getSymbol=$}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "2147483648", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".5", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".,5", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "2"}, {"append", "char", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1\000 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 / 3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:6>"}, true), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:5>"}, true), new String[][]{{"format", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5e300", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:1>", "<sample:3>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:3>", "<sample:2>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:3>", "<sample:2>"}, false, 9, new String[][]{}), new String[][]{{"codePointAt", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:1>", "<sample:3>", "<sample:2>"}, false, 9, new String[][]{}), new String[][]{{"codePointAt", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:11>", "<sample:3>", "<sample:4>"}, false, 9, new String[][]{}), new String[][]{{"codePointAt", "int", "2"}, {"append", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("11 0 / 10\000  {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:22>", "<sample:3>", "<sample:4>"}, false, 9, new String[][]{}), new String[][]{{"codePointAt", "int", "2"}, {"append", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("22 0 / 10\000  {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:22>", "<sample:2>", "<sample:4>"}, false, 9, new String[][]{}), new String[][]{{"codePointAt", "int", "2"}, {"append", "char[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample22 0 / 10\000  {length=17}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:22>", "<sample:2>", "<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}), new String[][]{{"codePointAt", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("115", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<null>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5e300", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5e300", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5e300", "<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TITLE5.", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ba3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"http://example.com/a?b=c", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "a,b,c"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<empty>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 0 / 1 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<empty>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2 / 3 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:4>", "<sample:6>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample2 / 3 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:6>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample-1 0 / 1 {length=14}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:6>", "<sample:2>"}, false), new String[][]{{"append", "java.lang.StringBuffer", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample-1 0 / 1sample {length=20}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "1.5e300"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}), new String[][]{{"getMaximumIntegerDigits", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"getRoundingMode", "", "2"}, {"setCurrency", "java.util.Currency", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1e10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}), new String[][]{{"getPositivePrefix", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "-1", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:3>", "<null>", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", ".5"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"getDenominatorFormat", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"getDenominatorFormat", "", "3"}, {"getGroupingSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getGroupingSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "<a>b</a>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 / 1 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false), new String[][]{{"getMultiplier", "", "2"}, {"isParseIntegerOnly", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a 6b\t", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a 6b\t", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a 6b\t1.12345678901234567", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"getDenominatorFormat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:5>", "<empty>", "<sample:5>"}, false), new String[][]{{"subSequence", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<empty>", "<sample:4>"}, false, 13, new String[][]{}), new String[][]{{"append", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 12147483647 {length=17}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true), new String[][]{{"parse", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"010", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".5", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true), new String[][]{{"parse", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"format", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"12:30:45", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"setGroupingUsed", "boolean", "6"}, {"isGroupingUsed", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "-6337346779577272307", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:2>"}}), new String[][]{{"getMultiplier", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "-6337346779577272307", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<sample:1>", "<sample:6>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", "java.text.NumberFormat", "<sample:1>"}}), new String[][]{{"format", "double,java.lang.StringBuffer,java.text.FieldPosition", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample-1 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"getWholeFormat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 / 3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:5>", "<sample:3>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setNumeratorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:5>", "<sample:3>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<d:1.5>", "<sample:0>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:6>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "L", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"parseObject", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.25", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-2>", "<null>", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "1E-\n522020-00-30S26:61;:"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false), new String[][]{{"getCurrency", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("USD {getCurrencyCode=USD, getDefaultFractionDigits=2, getDisplayName=US Dollar, getNumericCode=840, getNumericCodeAsString=840, getSymbol=$}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getCurrency", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("XXX {getCurrencyCode=XXX, getDefaultFractionDigits=-1, getDisplayName=Unknown Currency, getNumericCode=999, getNumericCodeAsString=999, getSymbol=XXX}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getCurrency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("XXX {getCurrencyCode=XXX, getDefaultFractionDigits=-1, getDisplayName=Unknown Currency, getNumericCode=999, getNumericCodeAsString=999, getSymbol=XXX}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"getCurrency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("EUR {getCurrencyCode=EUR, getDefaultFractionDigits=2, getDisplayName=Euro, getNumericCode=978, getNumericCodeAsString=978, getSymbol=\u20ac}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 2), new String[][]{{"getPositivePrefix", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1E-5", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "", "<sample:4>"}}), new String[][]{{"getNegativePrefix", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"getGroupingSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3), new String[][]{{"getGroupingSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"5.", "<sample:5>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:2>"}}), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "2020-01-01"}}, 1), new String[][]{{"getMaximumFractionDigits", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null", "<null>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "1.1234567890123456"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString$AttributedStringIterator", actual.getClass().getName());
  assertEquals("{getBeginIndex=0, getEndIndex=5, getIndex=0, getRunLimit=5, getRunStart=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:2>", "<empty>", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 2), new String[][]{{"append", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<empty>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 2), new String[][]{{"append", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 / 1 {length=5}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getAvailableLocales", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "<null>", "<sample:5>"}}, 1), new String[][]{{"codePointBefore", "int", "7"}, {"length", "", "1"}, {"append", "float", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 0 / 1Infinity {length=15}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "<null>", "<sample:5>"}}, 1), new String[][]{{"codePointBefore", "int", "7"}, {"length", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "abc", "<sample:7>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:6>", "<null>", "<null>"}}, 1), new String[][]{{"insert", "int,java.lang.String", "7"}, {"insert", "int,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampfalsele0 / 1 {length=16}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:0>", "<sample:8>"}, false, 10, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:2>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 3), new String[][]{{"append", "java.lang.StringBuffer", "5"}, {"append", "float", "3"}, {"insert", "int,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:2>"}}, 3), new String[][]{{"getMaximumIntegerDigits", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:0>", "<empty>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:1>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:0>", "<empty>", "<sample:2>"}}, 3), new String[][]{{"format", "double,java.lang.StringBuffer,java.text.FieldPosition", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample-\u221e {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setMinimumFractionDigits", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=2, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=2, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#-26534078", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getAvailableLocales", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.util.Locale;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"nuk", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", ".5", "<null>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "+13", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:8>", "<sample:2>", "<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:2>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<sample:5>", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"getNumeratorFormat", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false), new String[][]{{"getRoundingMode", "", "0"}, {"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "5"}, {"append", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample20 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/a/b-6337346779577272307", "<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("3 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "1.123456"}}, 3), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "6"}, {"indexOf", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "1.123456"}}, 1), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "6"}, {"indexOf", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"format", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 / 3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7 / 8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<empty>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:f>", "<sample:3>", "<sample:1>"}, false, 15, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:6>", "<sample:4>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TIU\t", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("U", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TIU\t", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", new String[]{"java.text.NumberFormat"}, new String[]{"<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "formatFraction", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 / 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:1.5>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1 1 / 2 {length=7}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:0.15>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<empty>", "<sample:0>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("3 / 20 {length=6}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:0.15>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<empty>", "<sample:0>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample3 / 20 {length=12}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<d:0.015>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:7>", "<empty>", "<sample:0>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample3 / 200 {length=13}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 / 1 {length=11}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "5"}, {"insert", "int,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampfalsele0 / 1 {length=16}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "5"}, {"insert", "int,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"isGroupingUsed", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("-1 0 / 1 {length=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}}, 3), new String[][]{{"offsetByCodePoints", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\u00e9", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"PT1Ha", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"PT1Ha", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:2>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "\n", "<sample:3>"}}, 1), new String[][]{{"insert", "int,int", "3"}, {"indexOf", "java.lang.String", "4"}, {"appendCodePoint", "int", "3"}, {"append", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("s2147483647ample2 0 / 1\001 {length=24}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".5", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ba3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:=b>", "<sample:2>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"K1.5e300", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@8646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:5>"}}, 3), new String[][]{{"setMinimumFractionDigits", "int", "0"}, {"getRoundingMode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.math.RoundingMode", actual.getClass().getName());
  assertEquals("HALF_EVEN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:5>"}}, 3), new String[][]{{"setMinimumFractionDigits", "int", "0"}, {"getRoundingMode", "", "0"}, {"getGroupingSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:5>"}}, 3), new String[][]{{"setMinimumFractionDigits", "int", "0"}, {"getRoundingMode", "", "0"}, {"getGroupingSize", "", "7"}, {"isGroupingUsed", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"setDenominatorFormat", "java.text.NumberFormat", "4"}, {"getNumeratorFormat", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.FractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<null>", "<sample:1>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:2>"}}, 2), new String[][]{{"getMaximumIntegerDigits", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"parse", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"parse", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1.1234}7901234>56{!a\"91}"}, false, 15, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String"}, new String[]{"1/1244D790123>56{!a\"91}-1i"}, false, 15, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:5>", "<null>", "<sample:1>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5fea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:6>", "<sample:0>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:4>", "<sample:0>", "<sample:4>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "1L", "<sample:7>"}}, 1), new String[][]{{"append", "java.lang.CharSequence", "1"}, {"appendCodePoint", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"formatToCharacterIterator", "java.lang.Object", "3"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"parseObject", "java.lang.String,java.text.ParsePosition", "3"}, {"getNumeratorFormat", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "5."}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:5>"}}, 3), new String[][]{{"format", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9\u00a0223\u00a0372\u00a0036\u00a0854\u00a0775\u00a0807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "5."}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setDenominatorFormat", "java.text.NumberFormat", "<sample:5>"}}, 3), new String[][]{{"format", "long", "4"}, {"getMaximumFractionDigits", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
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
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.ProperFractionFormat", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"getDenominatorFormat", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i\\1]\\1.12345678901234567", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i\\1]\\1.12345678901234567", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i\\1\\1.1", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"i\\1\\1", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"H-0-0", "<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", ""}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "a,b,c", "<sample:3>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "TIoLE", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"getMinimumFractionDigits", "", "7"}, {"getGroupingSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getMultiplier", "", "3"}, {"getCurrency", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("XXX {getCurrencyCode=XXX, getDefaultFractionDigits=-1, getDisplayName=Unknown Currency, getNumericCode=999, getNumericCodeAsString=999, getSymbol=XXX}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getMultiplier", "", "3"}, {"getCurrency", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Currency", actual.getClass().getName());
  assertEquals("EUR {getCurrencyCode=EUR, getDefaultFractionDigits=2, getDisplayName=Euro, getNumericCode=978, getNumericCodeAsString=978, getSymbol=\u20ac}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{" ", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"--64373677957272307\n", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "3"}, {"subSequence", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parseObject", "java.lang.String,java.text.ParsePosition", "12;30:45", "<sample:9>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "getDenominatorFormat", ""}}, 3), new String[][]{{"format", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1E-5", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String", "2020-02-30T25:61:61"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ba3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"5.<a>b</a>", "<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"getDenominatorFormat", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getDefaultNumberFormat", new String[]{}, new String[]{}, true), new String[][]{{"format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseNextCharacter", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a\u00e9=c", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "format", new String[]{"org.apache.commons.math.fraction.Fraction", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<sample:7>", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "parse", "java.lang.String,java.text.ParsePosition", "htttp://example.com/a?b=c", "<sample:3>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:3>", "<sample:1>"}}, 2), new String[][]{{"codePointAt", "int", "2"}, {"insert", "int,double", "7"}, {"codePointBefore", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getProperInstance", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, true), new String[][]{{"getWholeFormat", "", "5"}, {"format", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:5>", "<sample:3>", "<sample:5>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:2>"}}, 2), new String[][]{{"getMaximumFractionDigits", "", "3"}, {"formatToCharacterIterator", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getWholeFormat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "org.apache.commons.math.fraction.Fraction,java.lang.StringBuffer,java.text.FieldPosition", "<sample:5>", "<sample:3>", "<sample:5>"}, {"org.apache.commons.math.fraction.ProperFractionFormat", "setWholeFormat", "java.text.NumberFormat", "<sample:0>"}}, 2), new String[][]{{"getMaximumFractionDigits", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getImproperInstance", new String[]{"java.util.Locale"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"getNumeratorFormat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.text.DecimalFormat", actual.getClass().getName());
  assertEquals("{getGroupingSize=3, getMaximumFractionDigits=0, getMaximumIntegerDigits=2147483647, getMinimumFractionDigits=0, getMinimumIntegerDigits=1, getMultiplier=1, getNegativePrefix=-, getNegativeSuffix=, get...#371#512240838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "getNumeratorFormat", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.fraction.ProperFractionFormat", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<sample:3>", "<sample:6>"}}, 3), new String[][]{{"format", "long,java.lang.StringBuffer,java.text.FieldPosition", "2"}, {"append", "float", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("00.0 {length=4}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.ProperFractionFormat", "org.apache.commons.math.fraction.ProperFractionFormat", "parseAndIgnoreWhitespace", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\t", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
