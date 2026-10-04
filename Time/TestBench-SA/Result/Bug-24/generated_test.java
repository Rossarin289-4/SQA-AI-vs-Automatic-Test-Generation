package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:6>", "0"}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "-7"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:6>", "Q/", "<null>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "I"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-268435456"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:10>", "-536870912"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:6>", "Q//", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "I44"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "-1056704"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:12>", "2"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "214b7484648-0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:2>", "1.12345678901234567", "<empty>"}, {"org.joda.time.format.DateTimeParserBucket", "saveState", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:16>", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:9>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}, {"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800007", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "18..12345p788A012456"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:0>", "4", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "1073741657"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62042235341657", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=1073741657, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "-1056665"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "-15728472"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-1056704"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-496414963755743296", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-1056704, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "-2147483648"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<null>", "2147483647"}, {"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:0>", "2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "-2147483648"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "2147483616"}, {"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "-2147483648"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "2147483616"}, {"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "2147483622"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "1073741808"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "262143"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:9>", "-262143"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "-262136"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "-1056704"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", "Cannot parse \"", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:3>", "0"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "2147483635"}, false, 9, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:3>", "Cannot parse \"", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "2"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:3>", "Cannot parse \"", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "-7"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:3>", "Cannot parse", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "saveState", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "1073741749"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-2147483648"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", "Cannot parse", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:8>", "-1"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-1073741824"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", "Dannot parse", "<sample:4>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:10>", "-2147483648"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", "tbnnot parse", "<sample:4>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "1e10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:8>", "10"}, false, 12, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:7>", "tbnnnt parse", "<sample:4>"}, {"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "1e10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:3>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:6>", ".5", "<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:1>", "", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<b:false>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "0e1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 8, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:1>", "", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "0d1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:1>", "", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "0d1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:1>", "", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "0d1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:1>", "0", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "0d1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:0>", "0", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "0d1tbnnnt parse"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "-2147483648"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:0>", "0", "<sample:0>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "0d1tbnnnt parse"}, {"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "-2147483622"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483622"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:0>", "/", "<sample:0>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "{\"a\":_}"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "2147481587"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483622"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:0>", "/", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "{\"1a\":_}"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "-2147483648"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483622"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:0>", "/", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "I"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:6>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.EthiopicChronology", actual.getClass().getName());
  assertEquals("EthiopicChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getDisplayVariant", "", "0"}, {"clone", "", "0"}, {"getDisplayVariant", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "abc"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.EthiopicChronology", actual.getClass().getName());
  assertEquals("EthiopicChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "2020-02-30T25:61:61"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=1, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "1L"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"-536870912"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:4>", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-536870912, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "010"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}, {"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:4>", "10"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:16>", "1.5f", "<sample:2>"}, {"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "<a>b</a>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:6>", "-7"}, {"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62147088000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:4>", "tbnnot parse", "<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"millis", "", "2"}, {"getMillis", "long,long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:3>"}}, 3), new String[][]{{"withZone", "org.joda.time.DateTimeZone", "7"}, {"eras", "", "1"}, {"getMillis", "long,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<null>", "2020-01-01", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-1073741811"}}, 3), new String[][]{{"getUnicodeLocaleKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=-1073741811, getPivotYear=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-1073741811"}}, 2), new String[][]{{"getUnicodeLocaleKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=-1073741811, getPivotYear=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.JulianChronology", actual.getClass().getName());
  assertEquals("JulianChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology", actual.getClass().getName());
  assertEquals("LimitChronology[BuddhistChronology[UTC], 1969-12-31T16:00:00.000Z, 1969-12-31T16:00:00.001Z]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:4>"}, {"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:2>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:a>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:a>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:a>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "-58"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-58"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "0"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-2147483648, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "-7"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483648"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=1, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "-7"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483622"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-2147483622, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "-7"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483622"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:2>", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2147483622, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "-2097150"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "1073741823"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:2>", "2020-01-01", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "-2147483648"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<null>", "2147483647"}, {"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:0>", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:5>", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "-2147483647"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "getZone", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<b:true>"}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-1"}, {"org.joda.time.format.DateTimeParserBucket", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<null>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.EthiopicChronology", actual.getClass().getName());
  assertEquals("EthiopicChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:0>"}}), new String[][]{{"getDisplayName", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"2147483622"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2147483622, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-1, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "1.5e300"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "-1073741811"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "2147483622"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:1>", "/", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"2147483635"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2147483635, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}, {"org.joda.time.format.DateTimeParserBucket", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"-7"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-7, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:12>", "2147483647"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:10>", "-536870912"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:6>", "Q//", "<sample:3>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "I44"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "+1"}}), new String[][]{{"millisOfDay", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[millisOfDay] {getMaximumValue=86399999, getMinimumValue=0, getName=millisOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false), new String[][]{{"days", "", "3"}, {"getUnitMillis", "", "6"}, {"getDifferenceAsLong", "long,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "1E-5"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:1>", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"-536870912"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-536870912, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}), new String[][]{{"clone", "", "0"}, {"getUnicodeLocaleKeys", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<null>", "/a/b", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}), new String[][]{{"set", "org.joda.time.ReadablePartial,long", "5"}, {"eras", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getExtension", "char", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "-1.5"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false), new String[][]{{"hours", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDurationField", actual.getClass().getName());
  assertEquals("DurationField[hours] {getName=hours, getUnitMillis=3600000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-1056704"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=-1056704, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:8>", "tbnnot parse", "<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "5."}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=2, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-61884432000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "-9"}, false, 13, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:16>", "105"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "h,b,c"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "202/-I22300T25:51:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "2147483622"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483622"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-2147483622, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "\t"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:7>"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-268435456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483622"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483617", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483622, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-2147483647"}, {"org.joda.time.format.DateTimeParserBucket", "saveState", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:1>", "-2147483647"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-2147483648"}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=1, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "-1073741811"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:4>", "-9"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "Cannot parse \""}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setZone", "org.joda.time.DateTimeZone", "<sample:5>"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:4>", "-1056704"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-2147483648, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "0"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=1, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=2, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:0>", "-1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-268435456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-268435456, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "I44"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "010"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:1>", "-9"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:0>", "2147483635"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:10>", "-1.5", "<sample:1>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=-2147483647, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-1073741811"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=-1073741811, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:0>", "http://example.com/a?b=c", "<null>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:0>", "http://example.com/a?b=c", "<sample:0>"}, false, 13, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BuddhistChronology", actual.getClass().getName());
  assertEquals("BuddhistChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.CopticChronology", actual.getClass().getName());
  assertEquals("CopticChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 17, new String[][]{}), new String[][]{{"dayOfWeek", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJDayOfWeekDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=256}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 18, new String[][]{}), new String[][]{{"dayOfMonth", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfMonthDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 19, new String[][]{}), new String[][]{{"clockhourOfDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfDay] {getMaximumValue=24, getMinimumValue=1, getName=clockhourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 20, new String[][]{}), new String[][]{{"dayOfMonth", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfMonthDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2), new String[][]{{"clockhourOfDay", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[clockhourOfDay] {getMaximumValue=24, getMinimumValue=1, getName=clockhourOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 22, new String[][]{}), new String[][]{{"dayOfMonth", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicDayOfMonthDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfMonth] {getMaximumValue=31, getMinimumValue=1, getName=dayOfMonth, getUnitMillis=86400000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=256}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isFixed", "", "6"}, {"getOffset", "long", "2"}, {"getShortName", "long,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-08:00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isFixed", "", "6"}, {"getOffset", "long", "2"}, {"getShortName", "long,java.util.Locale", "3"}, {"isFixed", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<i:39>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "1.1234567{"}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "1.1234567{-0.0"}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "2147483620"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2147483620}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveState", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeParserBucket$SavedState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=256}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", ".5"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", ".H,"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", ".H,"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}, {"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800016", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "1.5d"}, false, 14, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}, {"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}}), new String[][]{{"getOffsetFromLocal", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:7>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}), new String[][]{{"toLanguageTag", "", "5"}, {"getDisplayScript", "", "4"}, {"getVariant", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:10>", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("965225575807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:10>", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("946800000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397809", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800016", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getOffset", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-2147483648, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:4>", "24637484"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<s:2a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getDisplayName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a (0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getChronology", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}}), new String[][]{{"getID", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=255}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=256}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "true"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:5>", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:7>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setOffset", new String[]{"int"}, new String[]{"-7"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=-7, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}}, 3), new String[][]{{"isFixed", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"true", "a /"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-1073741811"}, {"org.joda.time.format.DateTimeParserBucket", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741810", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-1073741811, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-9, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-9, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "restoreState", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "-53"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=-53, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"-2147483608"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-2147483608}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setPivotYear", new String[]{"java.lang.Integer"}, new String[]{"1073741823"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "compareReverse", new String[]{"org.joda.time.DurationField", "org.joda.time.DurationField"}, new String[]{"<sample:9>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:6>", "an:not parsd \"", "<sample:1>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:12>", "-1.5", "<empty>"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "0"}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "setZone", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,java.lang.String,java.util.Locale", "<sample:0>", "http://example.com/a?b=c", "<sample:1>"}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeFieldType", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:5>", "0xFFFFFFFF", "<sample:4>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-1"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:7>", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "10"}, {"org.joda.time.format.DateTimeParserBucket", "getZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", ""}, {"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "false", " "}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-7"}, {"org.joda.time.format.DateTimeParserBucket", "saveState", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[UTC] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getZone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getPivotYear", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "saveField", new String[]{"org.joda.time.DateTimeField", "int"}, new String[]{"<sample:2>", "-2147483632"}, false, 8, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getLocale", ""}, {"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "+1"}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean,java.lang.String", "true", "+1"}, {"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800016", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getPivotYear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800016", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483640", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "computeMillis", "boolean", "false"}, {"org.joda.time.format.DateTimeParserBucket", "setOffset", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2147483636", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=2147483647, getPivotYear=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean", "java.lang.String"}, new String[]{"false", "00xFFFFFFF"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "restoreState", "java.lang.Object", "<sample:0>"}, {"org.joda.time.format.DateTimeParserBucket", "saveField", "org.joda.time.DateTimeField,int", "<sample:7>", "-1073741824"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0_SAMPLE {getCountry=SAMPLE, getDisplayCountry=SAMPLE, getDisplayLanguage=0, getDisplayName=0 (SAMPLE), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language...#288#1367554236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 3), new String[][]{{"getDisplayCountry", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "getOffset", ""}}, 3), new String[][]{{"getDisplayCountry", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeParserBucket", "org.joda.time.format.DateTimeParserBucket", "computeMillis", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeParserBucket", "setPivotYear", "java.lang.Integer", "-67108863"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getOffset=0, getPivotYear=-67108863}", SearchInputFactory_scaffolding.receiverState());
 }
}
