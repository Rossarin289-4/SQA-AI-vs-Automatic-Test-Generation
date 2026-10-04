package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:utt>"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:1>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.EthiopicChronology", actual.getClass().getName());
  assertEquals("EthiopicChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=-1, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:4>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:12>", "1.6d", "<sample:6>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", " a,b,c", "<null>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "null"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:4>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:1>", "1"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1191455999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62167363622000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:8>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "i"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "1"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:7>", "-1048586"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-33152783241600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "1.5f"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", "1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61894108800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:0>", "1"}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-57"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-57}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:1>", "2020-01-30T25:61:61", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "r"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:4>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:9>", "-9"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "2147483647"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:1>", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483647>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "-524269"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:4>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:-4>"}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:2>"}}, 1), new String[][]{{"clockhourOfHalfday", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfHalfday] {getMaximumValue=12, getMinimumValue=1, getName=clockhourOfHalfday, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:2>", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"yearOfEra", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfEra] {getMaximumValue=292272984, getMinimumValue=1, getName=yearOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:5>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:2>", "s", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<null>", "-2147483648"}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:3>", "abbc", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:8>", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:3>", "/a/b1.5d", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "P11H"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "i"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:9>", "0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}, {"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:1>", "0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-79"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-8"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:3>", "2147483583"}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "2147483647"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<null>"}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:6>", "a", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "2147483648-1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:8>", "33554431"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"0"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", ".51E-5"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "1.a0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "null2147483648"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "513"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-45978250022000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "2147483647"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:43>"}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:ttu>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:0>", "52"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:4>"}}, 3), new String[][]{{"getDisplayName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a (0, sample)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:6>", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "63"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:3>", "2147483647"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:7>", "-108"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "256"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=256, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:4>", "20"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:5>", "1.12345678901223456", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:2>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "\u00e9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getDisplayName", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:4>", "1"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:uu>"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"-1048586"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-1048586, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "2147483636"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "-1048586"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:4>", "-5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "-2147483589"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "1.12345678"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:5>", "4106"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<null>", "a+b,c", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:-2147483648>"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", "http://example.com/a?b=c", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<s:0uu>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "1048586"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("33028941542399998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=1, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "2147483647"}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:utt>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"1048619"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=1048619, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<i:-11>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:8>", "-2147483648"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:8>", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "0x123456789"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "2147483613"}, {"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483648"}}), new String[][]{{"getUnicodeLocaleKeys", "", "6"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "1073741806"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1073741803", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=1073741806, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:1>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:>"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:6>", "1.1234567", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:4>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483613"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<null>", "2147483613"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:0>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:-15>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "2020-11-l01"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "1E-5"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<null>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "TITLEhttp://example.com/a?b=c"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:25>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:4>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:2>", "12:30:452020-01-01", "<sample:1>"}}), new String[][]{{"add", "long,long,int", "6"}, {"hours", "", "7"}, {"getDifferenceAsLong", "long,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<i:59>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}}), new String[][]{{"millisOfSecond", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfSecond] {getMaximumValue=999, getMinimumValue=0, getName=millisOfSecond, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2097172"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-2097172, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:6>", "abci", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-122880"}}), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=-122880, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}), new String[][]{{"halfdayOfDay", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-2147483648, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:utt>"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:3>", "2147483647"}}), new String[][]{{"halfdays", "", "6"}, {"isSupported", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getUnicodeLocaleKeys", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-2147483648"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "33554435"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-33554436", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=33554435, getPivotYear=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getDisplayCountry", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:10>", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:utu>"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:6>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61925731200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.EthiopicChronology", actual.getClass().getName());
  assertEquals("EthiopicChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-1"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "31"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "+TITLE"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}), new String[][]{{"getUnicodeLocaleAttributes", "", "5"}, {"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-10, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "1073741823"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "2020-02-30S25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-25"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<null>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:5>", "0x123p456789", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "1E"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<null>", "1073741806"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "Hello, W0orld"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:6>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:4>", "1-5", "<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}}), new String[][]{{"getVariant", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "PT1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-16777216"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036837998593", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-16777216, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "1.5f1L"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}), new String[][]{{"weekyear", "", "4"}, {"isLenient", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:7>", "1073741823"}}), new String[][]{{"days", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "8193"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8193", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8193}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "1"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "/xx1F"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:2>", "Hello, Worldaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483613"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:1>", "\n-1", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "1o12345678901223456"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483647"}}), new String[][]{{"secondOfDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=-2147483647, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "1.25"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "0xFFFFFFFF"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "2147483647"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:0>", "--1abc0x1F", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"era", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[era] {getMaximumValue=1, getMinimumValue=0, getName=era, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:3>", "-1048578"}}), new String[][]{{"getName", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-08:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "-1"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-2147483619"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483619}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "65"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=65, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"268435456"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=268435456}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-2147483648"}}), new String[][]{{"getShortName", "long,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-07:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:5>", "-2147483648"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}), new String[][]{{"getOffset", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:utv>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}, {"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "  "}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:4>", "2147483613"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:2>", "0", "<sample:6>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "41"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=41, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:6>", "30"}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-60979219200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:3>", "a a", "<null>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "1073741823"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "-2147483648"}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}, 1), new String[][]{{"getDisplayScript", "", "6"}, {"getISO3Language", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "2"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:0>", "1.35", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "-2"}}, 3), new String[][]{{"toLanguageTag", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("und", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "1.1234567901234567a,b,c"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:0>", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", "I", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-40"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-40, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "43"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.EthiopicChronology", actual.getClass().getName());
  assertEquals("EthiopicChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=43, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "46"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=46, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:55>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483648"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "26"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61093538916353", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-2147483648, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=1, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "TitlI"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "2147483647"}}), new String[][]{{"convertLocalToUTC", "long,boolean", "1"}, {"convertUTCToLocal", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-8"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-32802"}}), new String[][]{{"minutes", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[minutes] {getName=minutes, getUnitMillis=60000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=-32802, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "-1.52157483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483613"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2147483613, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:4>", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:5>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:5>", "2147483613"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", "q-1", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61884345599996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "20"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483628"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483628", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483628, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "1073741826"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741826", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=1073741826}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "{\"a\"L:1}"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:7>", "2147483643"}}, 1), new String[][]{{"secondOfDay", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfDay] {getMaximumValue=86399, getMinimumValue=0, getName=secondOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-68"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-68", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-68, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:2>"}}), new String[][]{{"convertLocalToUTC", "long,boolean", "1"}, {"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775806", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=1, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}}, 3), new String[][]{{"getShortName", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-08:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-7"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:2>", "2147483647"}, {"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:b]>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", " 1.51.5d"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483577"}}, 1), new String[][]{{"getDisplayLanguage", "", "2"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483577, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "PT1H"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:3>", "Titlei", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-4194344"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:2>", "29"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-4194344, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", ";\":d"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<null>", "-62"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61915795200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:3>", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "-2097172"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:3>", "-1073741806"}, {"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:9>", "1"}, {"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
