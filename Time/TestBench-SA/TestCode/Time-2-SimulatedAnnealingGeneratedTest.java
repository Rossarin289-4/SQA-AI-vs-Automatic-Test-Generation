package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getUnitMillis", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "int,long", "-1", "12324121189001"}, {"org.joda.time.field.UnsupportedDurationField", "subtract", "long,int", "65536", "-1"}, {"org.joda.time.field.UnsupportedDurationField", "getName", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "long,long", "9223372036854775807", "-6390301302770925357"}, {"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "-53278362873887", "53278362873839"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "53278362873887"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3121567", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "0"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<null>"}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValue", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<null>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:11>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:4>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}, {"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long,long", "-6390301302770925357", "12324121189003"}, {"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long", "-9223372036854775808"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValue", new String[]{"long", "long"}, new String[]{"-10", "0"}, false, 1, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "-1"}, {"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "-6390301302770925357", "6390301302770925505"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:4>", "0"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:6>", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:6>", "29"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "29"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}, {"org.joda.time.Partial", "getChronology", ""}}), new String[][]{{"getPartial", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483647"}, {"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "int", "10"}, {"org.joda.time.field.UnsupportedDurationField", "subtract", "long,long", "334753339584543", "-33554431"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValue", "long", "0"}, {"org.joda.time.field.UnsupportedDurationField", "getUnitMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "50"}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "getField", "int", "-38"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:4>", "2147483647"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}}), new String[][]{{"isMatch", "org.joda.time.ReadablePartial", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-2147483648"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:9>"}}), new String[][]{{"get", "", "6"}, {"getRangeDurationField", "", "5"}, {"getAsString", "", "6"}, {"compareTo", "org.joda.time.ReadableInstant", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "50"}, {"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:2>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "20"}}, 3), new String[][]{{"addWrapFieldToCopy", "int", "0"}, {"plus", "org.joda.time.ReadablePeriod", "7"}, {"withFieldAdded", "org.joda.time.DurationFieldType,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{" \037\0376\n\t", "<sample:4>"}, false, 13, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "getField", "int", "29"}, {"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:6>", "-54"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" \037\0376\n\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-262159"}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<null>"}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:12>"}, {"org.joda.time.Partial", "hashCode", ""}}), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "1"}, {"setCopy", "java.lang.String", "6"}, {"isMatch", "org.joda.time.ReadableInstant", "7"}, {"withField", "org.joda.time.DateTimeFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=5, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[5, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:16>", "1"}, false, 7, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:12>", "10"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<null>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", " fiekd is unsuppoted", "<sample:3>"}}, 2), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "0"}, {"with", "org.joda.time.DateTimeFieldType,int", "6"}, {"isMatch", "org.joda.time.ReadableInstant", "1"}, {"withField", "org.joda.time.DateTimeFieldType,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[era=1, clockhourOfDay=4, clockhourOfHalfday=6] {getFieldTypes=[era, clockhourOfDay, clockhourOfHalfday], getFields=[DateTimeField[era], DateTimeField[clockhourOfDay], DateTime.., getValues=[1, 4, 6],...#208#131513938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "0.1", "<sample:0>"}}, 1), new String[][]{{"addToCopy", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0006 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[6], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:2>"}, {"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:7>"}}, 3), new String[][]{{"withMinimumValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-292269054 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-292269054], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"12:30"}, false, 0, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"12:20"}, false, 0, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:20", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"1220"}, false, 0, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1220", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"1220"}, false, 5, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-1"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1220", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"1220"}, false, 2, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-40"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1220", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 1, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-40"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"-1\u00e9"}, false, 1, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-40"}, {"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"-1\u00e91e10"}, false, 1, new String[][]{{"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1\u00e91\ufffd10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"-1\u00e91e10#"}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1\u00e91\ufffd10#", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"long", "long"}, new String[]{"24648242378006", "-6390301302770925358"}, false, 1, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("eras {getName=eras}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("days", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "int"}, new String[]{"-1", "1"}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "int", "2147483647"}, {"org.joda.time.field.UnsupportedDurationField", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifference", new String[]{"long", "long"}, new String[]{"-6390301302770925357", "-9223372036854775808"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:6>"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "long,long", "9223372036854775807", "-6390301302770925357"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "53278362873887"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3076183", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "long,long", "9223372036854775747", "-6390301302770925357"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "53278362873887"}, {"org.joda.time.field.UnsupportedDurationField", "add", "long,long", "53278362873888", "53278362873887"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "-56"}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", " "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "2147483647"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "+1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1686-04-22T23:59:59.999Z {getCenturyOfEra=17, getDayOfMonth=22, getDayOfWeek=3, getDayOfYear=112, getEra=1, getHourOfDay=23, getMillis=-1, getMillisOfDay=86399999, getMillisOfSecond=999, getMinuteOfDa...#329#1727712621", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "+1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1962-04-23T00:00:00.000Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=0, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=0, getMin...#309#-298885666", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "+1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-31T16:00:00.002-08:00 {getCenturyOfEra=19, getDayOfMonth=31, getDayOfWeek=3, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=2, getMillisOfDay=57600002, getMillisOfSecond=2, getMinuteOf...#328#2110172434", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "+1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("5881637-04-13T00:00:00.000-07:00 {getCenturyOfEra=58816, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=103, getEra=1, getHourOfDay=0, getMillis=185544378198000000, getMillisOfDay=0, getMillisOfSecond...#340#11165355", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<null>"}, {"org.joda.time.Partial", "toString", "java.lang.String", "+1"}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:5>", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-19T00:00:00.004Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=4, getMillisOfDay=4, getMillisOfSecond=4, getMinuteOfDay=0, getMin...#309#-315468971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<null>"}, {"org.joda.time.Partial", "toString", "java.lang.String", "+1"}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:5>", "10"}}, 2), new String[][]{{"minusSeconds", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1754-05-11T03:14:07.999Z {getCenturyOfEra=18, getDayOfMonth=11, getDayOfWeek=2, getDayOfYear=131, getEra=1, getHourOfDay=3, getMillis=2147483647999, getMillisOfDay=11647999, getMillisOfSecond=999, get...#337#-603516952", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<null>"}, {"org.joda.time.Partial", "toString", "java.lang.String", "+1"}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:5>", "10"}}, 2), new String[][]{{"minusSeconds", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("5881705-05-02T03:14:08.000-07:00 {getCenturyOfEra=58817, getDayOfMonth=2, getDayOfWeek=6, getDayOfYear=122, getEra=1, getHourOfDay=3, getMillis=185546525681648000, getMillisOfDay=11648000, getMillisOf...#353#1456477511", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<null>"}, {"org.joda.time.Partial", "toString", "java.lang.String", "+1"}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:3>", "1"}}, 2), new String[][]{{"minusSeconds", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("2038-01-18T21:14:08.002-08:00 {getCenturyOfEra=20, getDayOfMonth=18, getDayOfWeek=1, getDayOfYear=18, getEra=1, getHourOfDay=21, getMillis=2147490848002, getMillisOfDay=76448002, getMillisOfSecond=2, ...#340#-903109113", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isSupported", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValue", "long,long", "-9223372036854775808", "-4491275506181494"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "subtract", "long,long", "-1", "12324121189003"}, {"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int", "long"}, new String[]{"-1", "53278362873889"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "11"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "11"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "11"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:13>"}, false, 5, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:7>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "11"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "aaaLaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:6>"}}, 3), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1e10", "<sample:6>"}}, 3), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "3"}, {"without", "org.joda.time.DateTimeFieldType", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "toString", "java.lang.String", "-1.5"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "-0.0", "<sample:3>"}}, 3), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "3"}, {"without", "org.joda.time.DateTimeFieldType", "4"}, {"getFormatter", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.Partial", "getValues", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "-262141"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:13>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "\u00e9", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "subtract", new String[]{"long", "long"}, new String[]{"12324121189002", "53278362873887"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[dayOfYear]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0100 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[100], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:3>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:3>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-0010 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-10, 2, 3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:3>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-0010 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-10], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0004 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[4, 5, 6], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0005 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[5], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("days", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eras", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getName", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}}, 1), new String[][]{{"weeks", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[weeks] {getName=weeks, getUnitMillis=604800000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}}, 1), new String[][]{{"dayOfYear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfYear] {getMaximumValue=366, getMinimumValue=1, getName=dayOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}}, 1), new String[][]{{"days", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[America/Los_Angeles]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.JulianChronology", actual.getClass().getName());
  assertEquals("JulianChronology[UTC,mdfw=1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}}, 1), new String[][]{{"add", "org.joda.time.ReadablePeriod,long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("259200002", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}}, 1), new String[][]{{"add", "org.joda.time.ReadablePeriod,long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("259200002", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:7>"}}, 1), new String[][]{{"add", "org.joda.time.ReadablePeriod,long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("259200002", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology", actual.getClass().getName());
  assertEquals("GJChronology[America/Los_Angeles] {getMinimumDaysInFirstWeek=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getUnitMillis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int", "long"}, new String[]{"0", "-6390301302770925356"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int", "long"}, new String[]{"0", "-9223372036854775808"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "-9223372036854775808", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"long", "long"}, new String[]{"-6390301302770925358", "-6390301302770925358"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("eras {getName=eras}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, true), new String[][]{{"add", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:13>"}, true), new String[][]{{"getValue", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "subtract", "long,int", "0", "-1"}, {"org.joda.time.field.UnsupportedDurationField", "getName", ""}}), new String[][]{{"isSupported", "org.joda.time.Chronology", "3"}, {"isSupported", "org.joda.time.Chronology", "7"}, {"isSupported", "org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "subtract", "long,int", "0", "-1"}, {"org.joda.time.field.UnsupportedDurationField", "getName", ""}}), new String[][]{{"isSupported", "org.joda.time.Chronology", "3"}, {"isSupported", "org.joda.time.Chronology", "2"}, {"isSupported", "org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "subtract", new String[]{"long", "long"}, new String[]{"-6390301302770925356", "-6390301302770925358"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "subtract", new String[]{"long", "long"}, new String[]{"6390301302770925505", "334753339584543"}, false, 12, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "53278362873889"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "int"}, new String[]{"27", "1"}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}, {"org.joda.time.field.UnsupportedDurationField", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifference", new String[]{"long", "long"}, new String[]{"12324121189002", "-9223372036854775808"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValue", "int", "-1"}, {"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:1>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0001", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0006", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0007", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long,long", "53278362873889", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3076183", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long,long", "53278362873889", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3121567", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValue", new String[]{"long"}, new String[]{"53278362873887"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "subtract", "long,int", "53278362873888", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:2>", "-40"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", " "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getValue", "int", "-40"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getValue", "int", "-40"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValue", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "53278362873887"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"long"}, new String[]{"12324121189003"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "9223372036854775807", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483648"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "+1"}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:3>", "1"}}), new String[][]{{"isBefore", "org.joda.time.ReadableInstant", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "+1"}}), new String[][]{{"isBefore", "org.joda.time.ReadableInstant", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "+B1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValue", "long,long", "-9223372036854775808", "12324121189002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isSupported", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "int,long", "10", "-9223372036854775808"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long,long", "-9223372036854775808", "334753339584543"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:5>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-2147483648"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-262134"}, {"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:4>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:4>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:3>"}}), new String[][]{{"isEqual", "org.joda.time.ReadablePartial", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:11>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:4>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:3>"}}), new String[][]{{"isEqual", "org.joda.time.ReadablePartial", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:6>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "aaaLaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "aaaLaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:6>"}}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1e10", "<sample:6>"}}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "3"}, {"without", "org.joda.time.DateTimeFieldType", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "66846730"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1e10", "<sample:6>"}}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "3"}, {"without", "org.joda.time.DateTimeFieldType", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "-1.5"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "-0.0", "<sample:3>"}}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "3"}, {"without", "org.joda.time.DateTimeFieldType", "4"}, {"getFormatter", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "-1.5"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "-0.0", "<sample:3>"}}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "3"}, {"without", "org.joda.time.DateTimeFieldType", "4"}, {"getFormatter", "", "6"}, {"getValues", "", "4"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "-1.5"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<null>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "-0.0", "<sample:3>"}}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "3"}, {"without", "org.joda.time.DateTimeFieldType", "4"}, {"getFormatter", "", "6"}, {"getValues", "", "4"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:3>"}, {"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "0.1", "<sample:3>"}}), new String[][]{{"minus", "org.joda.time.ReadablePeriod", "3"}, {"without", "org.joda.time.DateTimeFieldType", "4"}, {"getFormatter", "", "6"}, {"getChronology", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:3>"}, {"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "0.1", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:4>"}, {"org.joda.time.Partial", "getFormatter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:11>"}, {"org.joda.time.Partial", "getFormatter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:11>"}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "2147221514"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:0>"}, {"org.joda.time.Partial", "getValues", ""}, {"org.joda.time.Partial", "getFormatter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.joda.time.Partial", "getChronology", ""}, {"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "-262134"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isSupported", ""}, {"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[days]", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isSupported", ""}, {"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras]", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<null>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:3>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("days", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eras", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3076183", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd, \ufffd \ufffd, \ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long"}, new String[]{"6390301302770925505"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.JulianChronology", actual.getClass().getName());
  assertEquals("JulianChronology[UTC,mdfw=1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "getFormatter", ""}}), new String[][]{{"set", "org.joda.time.ReadablePartial,long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62115871624193", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "getFormatter", ""}}), new String[][]{{"set", "org.joda.time.ReadablePartial,long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62115871624193", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "getFormatter", ""}}), new String[][]{{"set", "org.joda.time.ReadablePartial,long", "3"}, {"minuteOfDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, getRange=1440, getUnitMillis=60000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "getFormatter", ""}}), new String[][]{{"set", "org.joda.time.ReadablePartial,long", "3"}, {"minuteOfDay", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfDay] {getMaximumValue=1439, getMinimumValue=0, getName=minuteOfDay, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long", "long"}, new String[]{"53278362873887", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "-262134", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "-262134", "<null>"}}), new String[][]{{"weeks", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[weeks] {getName=weeks, getUnitMillis=604800000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "-262134", "<null>"}}), new String[][]{{"weekyear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[weekyear] {getMaximumValue=292272984, getMinimumValue=-292269338, getName=weekyear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "-262134", "<null>"}}), new String[][]{{"weekyear", "", "3"}, {"getMinimumValue", "org.joda.time.ReadablePartial", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-292269338", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "-262134", "<null>"}}), new String[][]{{"validate", "org.joda.time.ReadablePartial,int[]", "3"}, {"minuteOfHour", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.GJChronology$CutoverField", actual.getClass().getName());
  assertEquals("DateTimeField[minuteOfHour] {getMaximumValue=59, getMinimumValue=0, getName=minuteOfHour, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}, {"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "-262134", "<null>"}}), new String[][]{{"weeks", "", "3"}, {"getMillis", "int,long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "toStringList", ""}}), new String[][]{{"weeks", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[weeks] {getName=weeks, getUnitMillis=604800000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("885368", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:2>", "0"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:2>", "0"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:2>", "0"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:2>", "0"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:2>", "0"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-1"}}, 1), new String[][]{{"printTo", "java.io.Writer,long", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:6>", "29"}}, 1), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:6>", "29"}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:13>", "-1"}}, 1), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:6>", "29"}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:13>", "-1"}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}}, 1), new String[][]{{"parseInto", "org.joda.time.ReadWritableInstant,java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:6>", "29"}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:13>", "-1"}, {"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<null>"}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:3>", "29"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long", "long"}, new String[]{"-33554522", "12324121189002"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long", "long"}, new String[]{"0", "-9205357638345293939"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "subtract", "long,long", "-6390301302770925358", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.Partial", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false), new String[][]{{"getFieldType", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isSupported", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isSupported", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isSupported", ""}, {"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "9223372036854775807", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "53278362873887", "12324121189001"}, {"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long", "12324121188999"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "int", "29"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "53278362873887", "12324121189001"}, {"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long", "12324121172619"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "106556725747774", "12324121189013"}, {"org.joda.time.field.UnsupportedDurationField", "getUnitMillis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "53278362873887", "288242700272900757"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "int,long", "66846730", "1"}, {"org.joda.time.field.UnsupportedDurationField", "getUnitMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "53278362873887", "288242700272900757"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "int,long", "66846730", "1"}, {"org.joda.time.field.UnsupportedDurationField", "getUnitMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "66846730"}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:7>"}, {"org.joda.time.Partial", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"-2147483596"}, false, 1, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "getValue", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "0", "<sample:4>"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "0", "<sample:4>"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "334753339584543", "334753339584543"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[days]", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[dayOfYear]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0100 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[100], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0100 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[100], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[64], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getField", "int", "66846730"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1491362441", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "getField", "int", "66846727"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Partial", "getField", "int", "66846727"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1379701101", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "getField", "int", "66846727"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192712746", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "getField", "int", "66846727"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192712746", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "getField", "int", "66846727"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111921834", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "getField", "int", "66846727"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "getField", "int", "66846727"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-1", "<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-1073740800", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-2147483648", "<sample:0>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getField", "int", "-1"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValues", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.joda.time.Partial", "getValues", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<i:-1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=1]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:5>"}, {"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, true, 0, null, 1), new String[][]{{"getValueAsLong", "long,long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:13>"}, false, 1, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:8>"}, {"org.joda.time.Partial", "toStringList", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 12, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "14"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "0"}, {"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getMaximumValue=292272992, getMaximumValueOverall=292278993, getMinimumValue=-292269054, getMinimumValueOverall=-292269055, getName...#206#1570233574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "0"}, {"org.joda.time.Partial", "getChronology", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getMaximumValue=292272992, getMaximumValueOverall=292278993, getMinimumValue=-292269054, getMinimumValueOverall=-292269055, getName...#206#1570233574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "14"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}, {"org.joda.time.Partial", "getChronology", ""}}), new String[][]{{"getPartial", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "14"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}, {"org.joda.time.Partial", "getChronology", ""}}, 3), new String[][]{{"getPartial", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "14"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}, {"org.joda.time.Partial", "getChronology", ""}}, 2), new String[][]{{"getPartial", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "14"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}, {"org.joda.time.Partial", "getChronology", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "14"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}, {"org.joda.time.Partial", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=12, getAsShortText=12, getAsString=12, getAsText=12, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-292275054, get...#210#1030164026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}, {"org.joda.time.Partial", "getChronology", ""}, {"org.joda.time.Partial", "getFormatter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=12, getAsShortText=12, getAsString=12, getAsText=12, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-292275054, get...#210#1030164026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}, {"org.joda.time.Partial", "getChronology", ""}}, 3), new String[][]{{"getAsText", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}, {"org.joda.time.Partial", "getChronology", ""}}), new String[][]{{"getAsText", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:8>", "-54"}}), new String[][]{{"getAsText", "java.util.Locale", "1"}, {"getMaximumValueOverall", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("292278993", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483647"}, {"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "-40", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getChronology", ""}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:11>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483647"}, {"org.joda.time.Partial", "getChronology", ""}}, 3), new String[][]{{"getAsText", "", "7"}, {"compareTo", "org.joda.time.ReadableInstant", "3"}, {"getAsShortText", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483647"}, {"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:6>"}}, 3), new String[][]{{"getAsText", "", "7"}, {"compareTo", "org.joda.time.ReadableInstant", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483647"}, {"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:4>", "66846730"}}), new String[][]{{"getAsText", "", "7"}, {"compareTo", "org.joda.time.ReadablePartial", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
