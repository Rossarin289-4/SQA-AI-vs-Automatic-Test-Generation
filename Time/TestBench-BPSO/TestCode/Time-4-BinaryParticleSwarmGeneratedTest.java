package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "aaaaaaaaaaa+aaaaaaaaaaaaaaaaaa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "+1", "<sample:0>"}}), new String[][]{{"getValues", "", "4"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "0"}, false), new String[][]{{"withPeriodAdded", "org.joda.time.ReadablePeriod,int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0000 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[0], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "toString", ""}}), new String[][]{{"parseDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:6>"}, {"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=3, getAsShortText=3, getAsString=3, getAsText=3, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-292275054, getName...#206#-223035874", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "-2147483648"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "2"}, false, 4, new String[][]{}), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "5"}, {"isEqual", "org.joda.time.ReadablePartial", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}, 3), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "142"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "<null>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "2147483647"}}, 1), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "2"}, {"getFields", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<null>"}}), new String[][]{{"isMatch", "org.joda.time.ReadablePartial", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:9>"}, false, 4, new String[][]{}, 3), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=3, clockhourOfDay=4] {getFieldTypes=[year, clockhourOfDay], getFields=[DateTimeField[year], DateTimeField[clockhourOfDay]], getValues=[3, 4], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "-30636"}, false, 2, new String[][]{}), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "2"}, {"isMatch", "org.joda.time.ReadableInstant", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValue", new String[]{"int"}, new String[]{"4194362"}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:3>", "-1"}, false, 6, new String[][]{}), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "7"}, {"getPartial", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "<null>"}}), new String[][]{{"seconds", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[seconds] {getName=seconds, getUnitMillis=1000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "-1", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "-18"}, false), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "7"}, {"addWrapFieldToCopy", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("190732526 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[190732526], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.joda.time.Partial", "getValue", "int", "1073741823"}, {"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:0>"}}), new String[][]{{"setCopy", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0000 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[0, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "7"}, {"withMinimumValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-292275054 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-292275054], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:7>"}}), new String[][]{{"withMaximumValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("292278993 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[292278993, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:12>", "-16777216"}, false, 7, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<null>"}}), new String[][]{{"compareTo", "org.joda.time.ReadablePartial", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:12>", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-1"}, false), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "1"}, {"addToCopy", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0002 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[2], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:10>"}, false, 5, new String[][]{}, 1), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "0"}, {"isMatch", "org.joda.time.ReadableInstant", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:16>", "55"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:12>", "0"}, false, 7, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:2>"}, {"org.joda.time.Partial", "getValues", ""}}), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:22>", "32695"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:12>", "-1"}, false, 7, new String[][]{}), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "6"}, {"withPeriodAdded", "org.joda.time.ReadablePeriod,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfDay=4, clockhourOfHalfday=5] {getFieldTypes=[clockhourOfDay, clockhourOfHalfday], getFields=[DateTimeField[clockhourOfDay], DateTimeField[clockhourOfHal.., getValues=[4, 5], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-32748"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"2147483647", "<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"4194305"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValue", new String[]{"int"}, new String[]{"39"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:0>"}, {"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<i:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"getZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.Partial", "size", ""}, {"org.joda.time.Partial", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<s:jey>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<d:15.0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:5>"}}, 1), new String[][]{{"isMatch", "org.joda.time.ReadableInstant", "3"}, {"compareTo", "org.joda.time.ReadablePartial", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValue", "int", "-20"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:0>"}, {"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"\u00e92a b"}, false, 5, new String[][]{{"org.joda.time.Partial", "getValue", "int", "84"}, {"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.joda.time.Partial", "getFields", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "2147483647"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:<kez>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 3), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-32748"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-32748 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[-32748, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "{\"aX:1}", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "0"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:2>", "-16374"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"1", "<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "0"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:2>", "-1073741888"}, false, 7, new String[][]{}, 2), new String[][]{{"toStringList", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:10>", "71"}, false, 1, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"withZoneUTC", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[clockhourOfHalfday]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("885368", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 1), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfDay=4, clockhourOfHalfday=6] {getFieldTypes=[clockhourOfDay, clockhourOfHalfday], getFields=[DateTimeField[clockhourOfDay], DateTimeField[clockhourOfHal.., getValues=[4, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:8>"}}, 2), new String[][]{{"isMatch", "org.joda.time.ReadableInstant", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 2), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "3"}, {"with", "org.joda.time.DateTimeFieldType,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("year {getName=year}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false), new String[][]{{"getFields", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "2147483647", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"2147483647", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0006", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValue", new String[]{"int"}, new String[]{"301"}, false, 0, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<null>"}, {"org.joda.time.Partial", "getField", "int", "54"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("0007-12-31T16:00:00.001-07:52:58 {getCenturyOfEra=1, getDayOfMonth=31, getDayOfWeek=6, getDayOfYear=365, getEra=1, getHourOfDay=16, getMillis=-61914931621999, getMillisOfDay=57600001, getMillisOfSecon...#342#-739799733", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "2147483647", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:0>", "-2"}, false, 0, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:12>", "1"}, {"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:2>", "131"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:4>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:6>", "2147483647"}}), new String[][]{{"get", "org.joda.time.ReadablePartial,long", "5"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1970, 1970]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1962-04-23T00:00:00.000Z {getCenturyOfEra=17, getDayOfMonth=23, getDayOfWeek=4, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=0, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=0, getMin...#309#-298885666", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toStringList", ""}}), new String[][]{{"minusMinutes", "int", "1"}, {"plusDays", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1962-04-26T00:01:00.000Z {getCenturyOfEra=17, getDayOfMonth=26, getDayOfWeek=7, getDayOfYear=116, getEra=1, getHourOfDay=0, getMillis=259260000, getMillisOfDay=60000, getMillisOfSecond=0, getMinuteOfD...#322#-617898665", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1491362441", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "getValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "2147418112"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("885368", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false), new String[][]{{"isAfter", "org.joda.time.ReadablePartial", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:9>", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:0>", "10"}, false, 0, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "2147483647"}}), new String[][]{{"getFormatter", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.joda.time.Partial", "getValue", "int", "65526"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:5>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.EthiopicChronology", actual.getClass().getName());
  assertEquals("EthiopicChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:5>"}, {"org.joda.time.Partial", "getValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"aaaaaaaaaaa+aaaaEaaaaaaaaaaaaa", "<sample:0>"}, false, 1, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd+\ufffd\ufffd\ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "71"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:10>", "2147483647"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:0>"}, {"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:3>"}}), new String[][]{{"isMatch", "org.joda.time.ReadablePartial", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.joda.time.Partial", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "toStringList", ""}}), new String[][]{{"getMinimumDaysInFirstWeek", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "38"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0038 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[38], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "35", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "-21"}, false, 0, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:5>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "10"}, false, 1, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:6>", "4194314"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-16374"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:5>"}}), new String[][]{{"dayOfMonth", "", "7"}, {"add", "long,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:5>", "-1073741823"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:9>", "2147483647"}, {"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false), new String[][]{{"getFieldType", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"\ufffd\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.Partial", "getValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.joda.time.Partial", "size", ""}, {"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:5>"}}), new String[][]{{"hourOfDay", "", "1"}, {"getLeapAmount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}), new String[][]{{"compareTo", "org.joda.time.ReadablePartial", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<i:0>"}}), new String[][]{{"printTo", "java.lang.Appendable,long", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "2"}, false, 4, new String[][]{}), new String[][]{{"withFieldAdded", "org.joda.time.DurationFieldType,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false), new String[][]{{"get", "org.joda.time.ReadablePartial,long", "2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<null>", "33521684"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "71"}, false, 5, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}}), new String[][]{{"getFieldTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"halfdayOfDay", "", "1"}, {"getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "-65496"}, false, 0, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:0>"}}), new String[][]{{"getFieldType", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "40"}, false), new String[][]{{"withPeriodAdded", "org.joda.time.ReadablePeriod,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0040 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[40], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "0"}, false), new String[][]{{"property", "org.joda.time.DateTimeFieldType", "1"}, {"setCopy", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "size", ""}}), new String[][]{{"isParser", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 7, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false), new String[][]{{"getChronology", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BuddhistChronology", actual.getClass().getName());
  assertEquals("BuddhistChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "71"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0071 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[71], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "3"}}), new String[][]{{"size", "", "0"}, {"property", "org.joda.time.DateTimeFieldType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false), new String[][]{{"halfdayOfDay", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicChronology$HalfdayField", actual.getClass().getName());
  assertEquals("DateTimeField[halfdayOfDay] {getMaximumValue=1, getMinimumValue=0, getName=halfdayOfDay, getRange=2, getUnitMillis=43200000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}), new String[][]{{"getFieldTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "10"}, false, 5, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0010 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[10, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "-32748"}, false), new String[][]{{"isMatch", "org.joda.time.ReadableInstant", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:2>", "-2147483648"}, false, 7, new String[][]{}), new String[][]{{"indexOf", "org.joda.time.DateTimeFieldType", "1"}, {"plus", "org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"yearOfCentury", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.RemainderDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[yearOfCentury] {getDivisor=100, getMaximumValue=99, getMinimumValue=0, getName=yearOfCentury, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "1048576"}, false, 1, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:4>"}}), new String[][]{{"toDateTime", "org.joda.time.ReadableInstant", "7"}, {"getYear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("104857586", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=6, year=7]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}}), new String[][]{{"isMatch", "org.joda.time.ReadablePartial", "2"}, {"toDateTime", "org.joda.time.ReadableInstant", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("5881637-04-13T00:00:00.000-07:00 {getCenturyOfEra=58816, getDayOfMonth=13, getDayOfWeek=1, getDayOfYear=103, getEra=1, getHourOfDay=0, getMillis=185544378198000000, getMillisOfDay=0, getMillisOfSecond...#340#11165355", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:9>"}, false, 4, new String[][]{}), new String[][]{{"withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "1"}, false, 4, new String[][]{}), new String[][]{{"getField", "int", "2"}, {"isLeap", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.JulianChronology", actual.getClass().getName());
  assertEquals("JulianChronology[UTC,mdfw=1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getValue", "int", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1001170", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"printTo", "java.lang.StringBuffer,long", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.joda.time.Partial", "getValues", ""}}), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "1"}, {"without", "org.joda.time.DateTimeFieldType", "4"}, {"getField", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"centuryOfEra", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[centuryOfEra] {getMaximumValue=2922789, getMinimumValue=0, getName=centuryOfEra, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "1.5e3002147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:0>", "2147483647"}, false, 4, new String[][]{}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "5"}, {"getValue", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:3>", "2147221439"}}), new String[][]{{"era", "", "7"}, {"getLeapAmount", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:10>", "1"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003--01 {getFieldTypes=[year, dayOfMonth], getFields=[DateTimeField[year], DateTimeField[dayOfMonth]], getValues=[3, 1], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "0"}, false, 5, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:0>", "-51"}}), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-2147483648", "<sample:2>"}, false, 1, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-16"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:,>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=6, year=7]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:8>"}, false, 3, new String[][]{}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:5>"}}), new String[][]{{"getChronology", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "1:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "-1"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:1>", "20"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "-1"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-0001 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[-1, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"dayOfWeek", "", "6"}, {"addWrapField", "long,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "-32753"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "0"}, {"print", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1969", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:2>"}}, 3), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "-2147483648"}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:8>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"withPeriodAdded", "org.joda.time.ReadablePeriod,int", "2"}, {"compareTo", "org.joda.time.ReadablePartial", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 1), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"\u00e95."}, false, 7, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e95.", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.JulianChronology", actual.getClass().getName());
  assertEquals("JulianChronology[UTC,mdfw=1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:9>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.joda.time.Partial", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.joda.time.Partial", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:5>", "-1073741824"}, false, 7, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:3>"}}), new String[][]{{"toStringList", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:7>", "-2"}, false, 7, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}, 2), new String[][]{{"withChronologyRetainFields", "org.joda.time.Chronology", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"eras", "", "6"}, {"getName", "", "3"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("eras {getName=eras}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:0>"}}), new String[][]{{"withPeriodAdded", "org.joda.time.ReadablePeriod,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:2>", "2"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.joda.time.Partial", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year, year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
