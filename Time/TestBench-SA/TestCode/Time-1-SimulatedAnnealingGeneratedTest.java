package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}), new String[][]{{"getPartial", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long"}, new String[]{"-6390301302770925357"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "-1"}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<null>", "-35"}, {"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-1], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[halfdays] {getName=halfdays, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifference", new String[]{"long", "long"}, new String[]{"0", "9223372036854775807"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValue", "long", "53278362873887"}, {"org.joda.time.field.UnsupportedDurationField", "subtract", "long,long", "616228316295199", "-6390301852526739244"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "<null>", "<null>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "-118"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"1", "1232439452721214"}, false, 8, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "-6390301852526739243", "-6390301852526739283"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "int,long", "-118", "-3195150651385462678"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "int", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:7>", "0"}, false, 13, new String[][]{}, 2), new String[][]{{"isMatch", "org.joda.time.ReadablePartial", "2"}, {"getValue", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "-1073741816"}, {"org.joda.time.Partial", "toString", "java.lang.String", "<null>"}, {"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:6>", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "1"}, false, 13, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}, {"org.joda.time.Partial", "getFieldTypes", ""}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:1>", "20"}}, 3), new String[][]{{"isEqual", "org.joda.time.ReadablePartial", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "-16285"}, false, 2, new String[][]{{"org.joda.time.Partial", "toString", ""}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "getField", "int", "-1073741816"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "3"}, false, 2, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<sample:0>"}, {"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:10>", "-118"}}, 2), new String[][]{{"withChronologyRetainFields", "org.joda.time.Chronology", "5"}, {"minus", "org.joda.time.ReadablePeriod", "6"}, {"isMatch", "org.joda.time.ReadablePartial", "4"}, {"property", "org.joda.time.DateTimeFieldType", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-292275054, getName...#206#1709345122", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "1"}, false, 2, new String[][]{{"org.joda.time.Partial", "size", ""}, {"org.joda.time.Partial", "equals", "java.lang.Object", "<b:true>"}}), new String[][]{{"size", "", "0"}, {"withChronologyRetainFields", "org.joda.time.Chronology", "5"}, {"isMatch", "org.joda.time.ReadablePartial", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "-8142"}}), new String[][]{{"getFieldTypes", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "-37"}, false, 10, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<b:true>"}}, 3), new String[][]{{"indexOf", "org.joda.time.DateTimeFieldType", "2"}, {"with", "org.joda.time.DateTimeFieldType,int", "4"}, {"withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[centuryOfEra=4, year=-37] {getFieldTypes=[centuryOfEra, year], getFields=[DateTimeField[centuryOfEra], DateTimeField[year]], getValues=[4, -37], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "2147475455"}, false, 11, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<null>"}, {"org.joda.time.Partial", "getFieldType", "int", "140"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "-134217780"}, false, 7, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-2147479614"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:16>", "-2147483645"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:12>"}}), new String[][]{{"isMatch", "org.joda.time.ReadableInstant", "1"}, {"minus", "org.joda.time.ReadablePeriod", "7"}, {"property", "org.joda.time.DateTimeFieldType", "7"}, {"setCopy", "java.lang.String,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=0, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[0, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValue", "long,long", "-1", "-6390301852526739283"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "0"}, {"org.joda.time.field.UnsupportedDurationField", "equals", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3121567", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getName", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "long,long", "616219726360585", "-6390301852526739243"}, {"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long,long", "288283654514585633", "24648242378002"}, {"org.joda.time.field.UnsupportedDurationField", "add", "long,int", "-6390301852526739244", "70"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "10"}, false, 7, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:6>"}, {"org.joda.time.Partial", "toString", ""}}), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "6"}, {"addToCopy", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfDay=12, clockhourOfHalfday=6] {getFieldTypes=[clockhourOfDay, clockhourOfHalfday], getFields=[DateTimeField[clockhourOfDay], DateTimeField[clockhourOfHal.., getValues=[12, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "1"}, false, 13, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:12>"}}), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "2"}, {"get", "org.joda.time.DateTimeFieldType", "0"}, {"minus", "org.joda.time.ReadablePeriod", "4"}, {"withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0001-016 {getFieldTypes=[year, dayOfYear], getFields=[DateTimeField[year], DateTimeField[dayOfYear]], getValues=[1, 16], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "-262010"}, false, 13, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "0"}}), new String[][]{{"withFieldAdded", "org.joda.time.DurationFieldType,int", "1"}, {"withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-262010-011 {getFieldTypes=[year, dayOfYear], getFields=[DateTimeField[year], DateTimeField[dayOfYear]], getValues=[-262010, 11], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "524020"}, false, 13, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "0"}, {"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:0>"}}), new String[][]{{"withFieldAdded", "org.joda.time.DurationFieldType,int", "6"}, {"withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("524020-016 {getFieldTypes=[year, dayOfYear], getFields=[DateTimeField[year], DateTimeField[dayOfYear]], getValues=[524020, 16], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "-14"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "2"}, {"withMaximumValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("292272992 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[292272992], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:16>", "130023316"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "12324121189002", "<empty>"}}, 3), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=7, getAsShortText=7, getAsString=7, getAsText=7, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-292275054, getName...#206#207169430", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0100 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[100], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "getValues", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getValues", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "getValues", ""}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[clockhourOfHalfday]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<null>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:7>", "-2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:3>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:4>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}}, 1), new String[][]{{"getCenturyOfEra", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}}, 1), new String[][]{{"getCenturyOfEra", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-2147483647"}}, 1), new String[][]{{"getCenturyOfEra", "", "7"}, {"getMinuteOfDay", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("960", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-2147483647"}}, 3), new String[][]{{"getCenturyOfEra", "", "7"}, {"getMinuteOfDay", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-2147483647"}}, 3), new String[][]{{"minusMillis", "int", "7"}, {"getMinuteOfDay", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1439", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"compareTo", "org.joda.time.DurationField", "0"}, {"isSupported", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"--1", "<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "getValue", "int", "-35"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:4>", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=12]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=1]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1.1234567890123456", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1.1234567890123456", "<sample:0>"}, {"org.joda.time.Partial", "getFormatter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1.1234567890123456", "<sample:0>"}, {"org.joda.time.Partial", "getFormatter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1.1234567890123456", "<sample:0>"}, {"org.joda.time.Partial", "getFormatter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=6, year=7]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1.1234567890123456", "<sample:0>"}, {"org.joda.time.Partial", "getFormatter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "2.1234567890123456", "<sample:0>"}, {"org.joda.time.Partial", "getFormatter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("885368", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"-6390301285591056151", "1232439452721214"}, false, 7, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "-6390301852526739244", "-6390301852526739283"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "int,long", "-118", "-3195150651385462678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"0", "616219726295084"}, false, 2, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "compareTo", "org.joda.time.DurationField", "<sample:2>"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "int", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:5>", "-1"}, false, 0, null, 1), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:7>", "-1"}, false, 0, null, 2), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:9>", "-70"}, false, 0, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:7>"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}}, 2), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "2"}, {"getValue", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:0>", "-35"}, false, 13, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:0>"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:3>"}}, 1), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "2"}, {"getValue", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:6>", "-35"}, false, 13, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:0>"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:6>", "-3"}, false, 13, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:0>"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "long"}, new String[]{"-6390301302770925356", "12324121189065"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getType", ""}, {"org.joda.time.field.UnsupportedDurationField", "getValue", "long,long", "53278362873869", "12324121189003"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int", "long"}, new String[]{"-2147483648", "-3195150651385462678"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "-6390301852526739283", "12324121189002"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int"}, new String[]{"-118"}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValue", "long", "53278362873887"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "getValue", "int", "2147483647"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"getMillis", "long", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0005 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 11, new String[][]{}, 2), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:2>"}}, 2), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0005 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:2>"}}, 2), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0005 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[5, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}}, 2), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"isAfterNow", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"isAfterNow", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"minusHours", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("6126621-01-20T07:00:00.000-08:00 {getCenturyOfEra=61266, getDayOfMonth=20, getDayOfWeek=6, getDayOfYear=20, getEra=1, getHourOfDay=7, getMillis=193275319330800000, getMillisOfDay=25200000, getMillisOf...#351#-264430855", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:5>"}}, 1), new String[][]{{"minusHours", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("246948-09-15T08:00:00.004Z {getCenturyOfEra=2467, getDayOfMonth=18, getDayOfWeek=2, getDayOfYear=18, getEra=1, getHourOfDay=8, getMillis=7730941132800004, getMillisOfDay=28800004, getMillisOfSecond=4,...#341#-483876768", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:1>"}}, 2), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "2"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "getField", "int", "-2147483647"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:1>"}}, 2), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "getField", "int", "-2147483647"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:1>"}}, 2), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "subtract", "long,int", "-6390301302770925358", "-35"}, {"org.joda.time.field.UnsupportedDurationField", "equals", "java.lang.Object", "<s:a>"}, {"org.joda.time.field.UnsupportedDurationField", "add", "long,long", "-6390301852526739243", "-6390301852526739243"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "20"}, {"org.joda.time.Partial", "getValues", ""}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "-1073741816"}, {"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:1>", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-1073741816"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "-1073741816"}, {"org.joda.time.Partial", "toString", "java.lang.String", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "70"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:10>", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "70"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:10>", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:2>", "-3"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getUnitMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "84"}, false, 1, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}}, 3), new String[][]{{"getChronology", "", "5"}, {"add", "long,long,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "84"}, false, 1, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifference", new String[]{"long", "long"}, new String[]{"12324121189001", "9223372036854775807"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifference", new String[]{"long", "long"}, new String[]{"12324121189001", "9223372036854775807"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "2147483647", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:4>", "-2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=1, getAsShortText=1, getAsString=1, getAsText=1, getMaximumValue=292272992, getMaximumValueOverall=292278993, getMinimumValue=-292269054, getMinimumValueOverall=-292269055, getName...#206#1570233574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:5>", "10"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:1>", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-2147483648"}, {"org.joda.time.Partial", "getFormatter", ""}}), new String[][]{{"withFieldAdded", "org.joda.time.DurationFieldType,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=1]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=6, year=7]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=12]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "0"}, false, 0, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0000 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[0], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "-35"}, false, 0, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-0035 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-35], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "-35"}, false, 0, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:0>"}}), new String[][]{{"isEqual", "org.joda.time.ReadablePartial", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "-35"}, false, 7, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "35"}, false, 7, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[centuryOfEra=35, clockhourOfHalfday=6] {getFieldTypes=[centuryOfEra, clockhourOfHalfday], getFields=[DateTimeField[centuryOfEra], DateTimeField[clockhourOfHalfd.., getValues=[35, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "35"}, false, 7, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=35, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[35, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "35"}, false, 10, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0035 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[35], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "35"}, false, 3, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0035 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[35, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "35"}, false, 6, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "4"}, false, 7, new String[][]{{"org.joda.time.Partial", "size", ""}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=4, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[4, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "70"}, false, 7, new String[][]{{"org.joda.time.Partial", "size", ""}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[centuryOfEra=70, clockhourOfHalfday=6] {getFieldTypes=[centuryOfEra, clockhourOfHalfday], getFields=[DateTimeField[centuryOfEra], DateTimeField[clockhourOfHalfd.., getValues=[70, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long", "long"}, new String[]{"12324121189003", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "-118"}, false, 7, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "35"}, {"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"long", "long"}, new String[]{"12324121189002", "-9223372036854775808"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isSupported", ""}, {"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("5881637-04-13T00:00:00.000-07:00 {getCenturyOfEra=58816, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=103, getEra=1, getHourOfDay=0, getMillis=185544378198000000, getMillisOfDay=0, getMillisOfSecond...#340#11165355", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}, {"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1969-12-19T00:00:00.004Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=4, getMillisOfDay=4, getMillisOfSecond=4, getMinuteOfDay=0, getMin...#309#-315468971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("178958997-06-03T00:00:00.000-07:00 {getCenturyOfEra=1789589, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=154, getEra=1, getHourOfDay=0, getMillis=5647338324428400000, getMillisOfDay=0, getMillisOfSe...#346#850162444", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("41159300-06-12T00:00:00.000-07:00 {getCenturyOfEra=411593, getDayOfMonth=12, getDayOfWeek=6, getDayOfYear=163, getEra=1, getHourOfDay=0, getMillis=1298799901321200000, getMillisOfDay=0, getMillisOfSec...#344#1156308439", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}}), new String[][]{{"getCenturyOfEra", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("411593", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}}), new String[][]{{"getCenturyOfEra", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}}), new String[][]{{"getCenturyOfEra", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483647"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}}), new String[][]{{"getCenturyOfEra", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("58816", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "getFields", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.Partial", "getFields", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "\t", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "\t", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "\t", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:7>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "\t", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"--1", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, true), new String[][]{{"add", "long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, true), new String[][]{{"compareTo", "org.joda.time.DurationField", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, true), new String[][]{{"compareTo", "org.joda.time.DurationField", "0"}, {"isSupported", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "int"}, new String[]{"53278362873888", "0"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getUnitMillis", ""}, {"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "long"}, new String[]{"616228316295199", "616228316295199"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"-35"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getUnitMillis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getUnitMillis", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "add", "long,int", "12324121189002", "-118"}, {"org.joda.time.field.UnsupportedDurationField", "toString", ""}, {"org.joda.time.field.UnsupportedDurationField", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "2147483647"}, {"org.joda.time.Partial", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("days", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:6>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "-118"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"long"}, new String[]{"12324121189001"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "add", "long,int", "1", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "toStringList", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:1>"}, {"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:1>"}, {"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[dayOfYear]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<null>", "-118"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "2.1234567890123456", "<sample:0>"}, {"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[dayOfYear=12]", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:7>"}, {"org.joda.time.Partial", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=64, year=100]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "subtract", new String[]{"long", "int"}, new String[]{"53278362873889", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int", "long"}, new String[]{"-2147483648", "9223372036854775807"}, false, 5, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "-1", "12324121189002"}, {"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "53278362873887", "-9223372036854775808"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:7>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"53278362873889", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"35"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:5>", "-1"}, false), new String[][]{{"getFormatter", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:0>", "-70"}, false, 1, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:0>"}, {"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:3>"}}), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "2"}, {"getValue", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "long"}, new String[]{"-6390301302770925356", "12324121189002"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValue", "long,long", "53278362873888", "12324121189003"}, {"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("eras {getName=eras}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("days", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"isSupported", "org.joda.time.Chronology", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"12356789012345678901234567890"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12356789012345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValue", new String[]{"long", "long"}, new String[]{"53278362873889", "1232439452721214"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0005 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}}), new String[][]{{"getFormatter", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "hashCode", ""}}), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"1", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "2"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "equals", "java.lang.Object", "<s:a>"}, {"org.joda.time.field.UnsupportedDurationField", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd, \ufffd \ufffd, \ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:5>"}, {"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("885368", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968572", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968604", String.valueOf(actual));
  assertEquals("receiver state after the call", "-012 {getFieldTypes=[dayOfYear], getFields=[DateTimeField[dayOfYear]], getValues=[12], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1379701101", String.valueOf(actual));
  assertEquals("receiver state after the call", "0064 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[64, 100, 255], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValue", "int", "-2147483647"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "10"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:2>"}, {"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "10"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:9>"}, {"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Partial", "size", ""}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:0>"}}), new String[][]{{"getFields", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "20"}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "PT1H", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:4>", "-118"}, false), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192712746", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111921834", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "35"}, {"org.joda.time.Partial", "getValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "84"}, false, 4, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}}, 3), new String[][]{{"getChronology", "", "5"}, {"add", "org.joda.time.ReadablePeriod,long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("259200002", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "84"}, false, 4, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}}), new String[][]{{"getChronology", "", "5"}, {"add", "org.joda.time.ReadablePeriod,long,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("259200002", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "93"}, false, 5, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}, {"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:2>"}}), new String[][]{{"getChronology", "", "5"}, {"add", "org.joda.time.ReadablePeriod,long,int", "4"}, {"dayOfWeek", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[dayOfWeek] {getMaximumValue=7, getMinimumValue=1, getName=dayOfWeek, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValue", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "int,long", "-2147483648", "53278362873889"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "1"}, false, 13, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:4>"}, {"org.joda.time.Partial", "getFieldTypes", ""}}, 3), new String[][]{{"isEqual", "org.joda.time.ReadablePartial", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"http://example.com/a?b=c", "<sample:0>"}, false, 4, new String[][]{{"org.joda.time.Partial", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "-118"}, false, 4, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "-118"}, false, 4, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:5>"}}, 1), new String[][]{{"isEqual", "org.joda.time.ReadablePartial", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:10>", "-118"}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "-118"}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:7>"}}, 1), new String[][]{{"isEqual", "org.joda.time.ReadablePartial", "5"}, {"isMatch", "org.joda.time.ReadablePartial", "4"}, {"isMatch", "org.joda.time.ReadableInstant", "2"}, {"isEqual", "org.joda.time.ReadablePartial", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "35"}, false, 5, new String[][]{}, 1), new String[][]{{"isEqual", "org.joda.time.ReadablePartial", "5"}, {"isMatch", "org.joda.time.ReadablePartial", "7"}, {"isMatch", "org.joda.time.ReadableInstant", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:10>", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:10>", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:10>", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[clockhourOfHalfday]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 12, new String[][]{{"org.joda.time.Partial", "toStringList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 12, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:6>"}, {"org.joda.time.Partial", "toStringList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0012 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[12, 16, 32], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 6, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:6>"}, {"org.joda.time.Partial", "toStringList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isParser", "", "0"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "2"}, {"parseLocalDate", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"isParser", "", "0"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial", "2"}, {"parseLocalDate", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("885368", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192712746", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111921834", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1491362441", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:8>"}, {"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1001170", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:6>"}, {"org.joda.time.Partial", "toString", "java.lang.String", " < "}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getUnitMillis", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "72110872400801823", "-6390301302770925356"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long,long", "53278362873889", "-6390301852526739243"}, {"org.joda.time.field.UnsupportedDurationField", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getUnitMillis", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isSupported", ""}, {"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "-9223372036854775808", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getUnitMillis", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isSupported", ""}, {"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "-9223372036854775808", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "20"}, false, 1, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:0>"}, {"org.joda.time.Partial", "toString", "java.lang.String", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:9>", "2147483647"}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
