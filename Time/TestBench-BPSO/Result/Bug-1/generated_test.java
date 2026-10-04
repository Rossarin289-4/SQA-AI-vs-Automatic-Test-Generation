package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValue", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValue", new String[]{"long", "long"}, new String[]{"-12324121189028", "26639181436944"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, true), new String[][]{{"getMillis", "int,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"122:300:45"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("122:300:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "subtract", "long,int", "-6390301302770925358", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long", "long"}, new String[]{"6390301302770925355", "26639181436944"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "equals", "java.lang.Object", "<b:true>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}), new String[][]{{"withChronologyRetainFields", "org.joda.time.Chronology", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "subtract", new String[]{"long", "int"}, new String[]{"6390301302636707629", "2147483647"}, false, 7, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "long,long", "9223372036854775807", "6390301302770925358"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "-6390301302770925356"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int"}, new String[]{"7"}, false, 7, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "-12324121189036", "4611679856366793403"}, {"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long", "-24648242378056"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValue", new String[]{"int"}, new String[]{"32778"}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<null>", "1073741823"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValue", new String[]{"long"}, new String[]{"-35150012350464"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "compareTo", "org.joda.time.DurationField", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:1>"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "32778"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:1>", "7"}, false, 6, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<d:-2.4000000000000004>"}}, 3), new String[][]{{"getValue", "int", "2"}, {"getFormatter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "7"}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "1.5f"}}), new String[][]{{"isMatch", "org.joda.time.ReadablePartial", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"withMaximumValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("292278993 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[292278993], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:7>"}}), new String[][]{{"get", "org.joda.time.DateTimeFieldType", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:1>"}}), new String[][]{{"getPartial", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"<null>", "<sample:1>"}, false, 4, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "-2147483648"}, {"org.joda.time.Partial", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "12324121188950", "-3"}, {"org.joda.time.field.UnsupportedDurationField", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "0"}, false, 4, new String[][]{}, 1), new String[][]{{"withField", "org.joda.time.DateTimeFieldType,int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-1], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValue", "long", "8070450532247928831"}, {"org.joda.time.field.UnsupportedDurationField", "subtract", "long,long", "6390301302770925357", "8994875133551989"}}), new String[][]{{"getField", "org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}), new String[][]{{"getMaximumTextLength", "java.util.Locale", "6"}, {"get", "", "4"}, {"setCopy", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0000 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[0, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "1073741823"}, false, 7, new String[][]{{"org.joda.time.Partial", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:2>", "0"}, false, 7, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:7>", "4133"}}), new String[][]{{"isSupported", "org.joda.time.DateTimeFieldType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "4"}, false, 7, new String[][]{}), new String[][]{{"plus", "org.joda.time.ReadablePeriod", "0"}, {"withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[centuryOfEra=6, clockhourOfHalfday=6] {getFieldTypes=[centuryOfEra, clockhourOfHalfday], getFields=[DateTimeField[centuryOfEra], DateTimeField[clockhourOfHalfd.., getValues=[6, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "7"}, false, 6, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:4>", "1073741823"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}), new String[][]{{"addWrapFieldToCopy", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("190732549 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[190732549, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 0, null, 2), new String[][]{{"withChronologyRetainFields", "org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:2>"}, {"org.joda.time.Partial", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "1"}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "1.1234567890123456", "<null>"}}), new String[][]{{"without", "org.joda.time.DateTimeFieldType", "1"}, {"withFieldAdded", "org.joda.time.DurationFieldType,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[centuryOfEra=3] {getFieldTypes=[centuryOfEra], getFields=[DateTimeField[centuryOfEra]], getValues=[3], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-2147483648"}}), new String[][]{{"addToCopy", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0004 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[4], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:12>", "0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:12>", "0"}, false, 7, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DateTimeFieldType", "<sample:7>"}}), new String[][]{{"with", "org.joda.time.DateTimeFieldType,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=1, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[1, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadableInstant", "<sample:7>"}}, 3), new String[][]{{"getAsText", "", "6"}, {"withMinimumValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-292275054 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-292275054], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"long", "long"}, new String[]{"-6162060594501", "-12324121189003"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "subtract", new String[]{"long", "long"}, new String[]{"9223372036854775807", "1090749894492160"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("885368", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "long"}, new String[]{"35184372088829", "-3195150651385462679"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "-9223372036854775808", "-4611686018427387904"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"106556725747774", "53278362873888"}, false, 1, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "equals", "java.lang.Object", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"22324121189002"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22324121189002", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifference", "long,long", "-24648242378056", "53278362873889"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3076183", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:10>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.Partial", "without", "org.joda.time.DateTimeFieldType", "<sample:5>"}}, 3), new String[][]{{"isSupported", "org.joda.time.DateTimeFieldType", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:2>", "1073741823"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "32778"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValues", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:5>", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "26639181436944"}, false, 6, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getMillis", "int,long", "-2147483647", "26639181436944"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:3.45>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValues", ""}, {"org.joda.time.Partial", "getValue", "int", "138"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getFields", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2), new String[][]{{"withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:6>"}, {"org.joda.time.Partial", "getFormatter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "int"}, new String[]{"14511155747166", "-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long"}, new String[]{"-34875134443520"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", "long,long", "26639181436957", "-6390301302770925357"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"2020-01-01", "<sample:2>"}, false, 6, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<b:false>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "int"}, new String[]{"106556725747824", "-1073741850"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:4>", "32778"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValue", "int", "2147483647"}, {"org.joda.time.Partial", "toStringList", ""}}, 3), new String[][]{{"getChronology", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValue", new String[]{"int"}, new String[]{"-1073741822"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:3>", "-62"}, false, 0, null, 2), new String[][]{{"getFormatter", "", "4"}, {"property", "org.joda.time.DateTimeFieldType", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"indexOf", "org.joda.time.DateTimeFieldType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 3), new String[][]{{"isBefore", "org.joda.time.ReadablePartial", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isSupported", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "compareTo", "org.joda.time.DurationField", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"1/5f"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"1.123456"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "size", ""}}, 3), new String[][]{{"isAfter", "org.joda.time.ReadablePartial", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "subtract", new String[]{"long", "long"}, new String[]{"12324121189002", "12324121188968"}, false, 6, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValue", "long", "-24648242378006"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483635"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:1>", "-2147483648"}, {"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<null>", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "int"}, new String[]{"12324121189003", "-2147483647"}, false, 7, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValue", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:8>"}, {"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-1", "<sample:4>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"[1,,2]"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,,2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValues", ""}}, 2), new String[][]{{"getField", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "-7"}, false, 0, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:3>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:5>"}, {"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:3>", "-2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0003", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "-3"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffdT\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.\ufffd\ufffd\ufffd-08:00 {getCenturyOfEra=!LimitException, getDayOfMonth=!LimitException, getDayOfWeek=!LimitException, getDayOfYear=!LimitException, getEra=!LimitException, getHourOfDay=!LimitEx...#516#-316091370", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:3>", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-2147483648", "<sample:6>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getValue", "int", "-2147483648"}, {"org.joda.time.Partial", "equals", "java.lang.Object", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=6, getAsShortText=6, getAsString=6, getAsText=6, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-292275054, getName...#206#1173359928", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getChronology", ""}, {"org.joda.time.Partial", "hashCode", ""}}, 2), new String[][]{{"isEqualNow", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "without", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "long"}, new String[]{"-6390301302770925356", "-35150012350464"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.joda.time.Partial", "getFieldType", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.joda.time.Partial", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "subtract", "long,int", "-3195150651385462679", "138"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "toString", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 1, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<null>", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial$Property", actual.getClass().getName());
  assertEquals("Property[year] {get=6, getAsShortText=6, getAsString=6, getAsText=6, getMaximumValue=292278993, getMaximumValueOverall=292278993, getMinimumValue=-292275054, getMinimumValueOverall=-292275054, getName...#206#1173359928", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("111921834", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "subtract", new String[]{"long", "long"}, new String[]{"-5268064855414", "-6390301302787702572"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getUnitMillis", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"-1", "<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "2147483647"}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:5>"}, {"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "12:300:45", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<null>"}, {"org.joda.time.Partial", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isEqual", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.UnsupportedDurationField", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifference", new String[]{"long", "long"}, new String[]{"-6390301302770925358", "-3081030297250"}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isSupported", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"getFields", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:4>"}, false), new String[][]{{"withPeriodAdded", "org.joda.time.ReadablePeriod,int", "0"}, {"withField", "org.joda.time.DateTimeFieldType,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "-1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[-1], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isSupported", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getValueAsLong", "long", "-6390301302770925356"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0001", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "get", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"int", "long"}, new String[]{"2147483647", "50"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"-24648242378056", "6390301302770925357"}, false, 6, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "equals", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("885368", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValue", new String[]{"long"}, new String[]{"-24648242378056"}, false, 7, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "add", "long,long", "12324121189003", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}}), new String[][]{{"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("days", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldType", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isSupported", ""}}), new String[][]{{"getField", "org.joda.time.Chronology", "6"}, {"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int"}, new String[]{"5"}, false, 7, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<s:keyn>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "toString", "org.joda.time.format.DateTimeFormatter", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[days]", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[clockhourOfHalfday]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0xFFFFFFE", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "138"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:3>"}, true), new String[][]{{"isSupported", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long"}, new String[]{"-12324121189028"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"2232412111890i02"}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int", "16389"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:0>", "1073741823"}, false, 3, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}), new String[][]{{"withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:8>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAddWrapped", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:0>", "32823"}, false, 4, new String[][]{{"org.joda.time.Partial", "toStringList", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"withZone", "org.joda.time.DateTimeZone", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "536870911", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("178958997-06-03T00:00:00.000-07:00 {getCenturyOfEra=1789589, getDayOfMonth=3, getDayOfWeek=6, getDayOfYear=154, getEra=1, getHourOfDay=0, getMillis=5647338324428400000, getMillisOfDay=0, getMillisOfSe...#346#850162444", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getFields", ""}, {"org.joda.time.Partial", "getFormatter", ""}}), new String[][]{{"compareTo", "org.joda.time.ReadablePartial", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "subtract", "long,int", "12392840665789", "2145386496"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3076183", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0006", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "get", "org.joda.time.DateTimeFieldType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1001170", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isOffsetParsed", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "add", new String[]{"long", "int"}, new String[]{"12324121189028", "10"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isPrecise", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getChronolgy", "", "5"}, {"print", "org.joda.time.ReadablePartial", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd\ufffd\ufffd\ufffd", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}), new String[][]{{"getAsText", "java.util.Locale", "6"}, {"setCopy", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "property", "org.joda.time.DateTimeFieldType", "<sample:1>"}}), new String[][]{{"parseLocalDateTime", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.joda.time.Partial", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:5>"}, true), new String[][]{{"getUnitMillis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "1073741856", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:9>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year], DateTimeField[year], DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0007", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DateTimeFieldType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ISOChronology", actual.getClass().getName());
  assertEquals("ISOChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("192712746", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getMillis", new String[]{"long", "long"}, new String[]{"24648242378004", "106556725747774"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}), new String[][]{{"getField", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=3]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "compareTo", new String[]{"org.joda.time.DurationField"}, new String[]{"<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}), new String[][]{{"isMatch", "org.joda.time.ReadableInstant", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.joda.time.Partial", "getValue", "int", "2147483647"}}), new String[][]{{"getChronology", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.JulianChronology", actual.getClass().getName());
  assertEquals("JulianChronology[UTC,mdfw=1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "2147483635"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0001", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "withFieldAdded", "org.joda.time.DurationFieldType,int", "<sample:5>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-1073741791"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.Partial", "toString", ""}}), new String[][]{{"toStringList", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[year=1]", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "-16711660", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFieldTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:0>", "2147483647"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:9>", "0"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeFieldType;", actual.getClass().getName());
  assertEquals("[year]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isPrecise", ""}}), new String[][]{{"isSupported", "org.joda.time.Chronology", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "-7"}, false, 7, new String[][]{{"org.joda.time.Partial", "getValues", ""}, {"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "32778", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("[year=-7, clockhourOfHalfday=6] {getFieldTypes=[year, clockhourOfHalfday], getFields=[DateTimeField[year], DateTimeField[clockhourOfHalfday]], getValues=[-7, 6], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1491362441", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 7, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<sample:6>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getValueAsLong", new String[]{"long", "long"}, new String[]{"53278362873853", "26639181436917"}, false, 5, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:3>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("days", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "isSupported", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eras", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"withChronology", "org.joda.time.Chronology", "4"}, {"isParser", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getInstance", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:10>"}, true), new String[][]{{"getType", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("halfdays {getName=halfdays}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.Partial", "getValues", ""}, {"org.joda.time.Partial", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "plus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:6>"}, {"org.joda.time.Partial", "getField", "int", "32778"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "1"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getValue", "int", "-46"}, {"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<null>", "2097152"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DurationFieldType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "size", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getUnitMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:5>"}}), new String[][]{{"secondOfMinute", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[secondOfMinute] {getMaximumValue=59, getMinimumValue=0, getName=secondOfMinute, getRange=60, getUnitMillis=1000, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-52>"}, false, 5, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String", "/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"getValues", "", "2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[6, 7, 8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:7>", "-19"}, false, 5, new String[][]{{"org.joda.time.Partial", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("-0019 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[-19, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getPivotYear", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.Partial", "isSupported", "org.joda.time.DateTimeFieldType", "<sample:3>"}, {"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.EthiopicChronology", actual.getClass().getName());
  assertEquals("EthiopicChronology[UTC]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.joda.time.Partial", "isEqual", "org.joda.time.ReadablePartial", "<sample:0>"}}), new String[][]{{"getFields", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[clockhourOfHalfday]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("0279-04-23T00:00:00.000Z {getCenturyOfEra=1, getDayOfMonth=23, getDayOfWeek=7, getDayOfYear=113, getEra=1, getHourOfDay=0, getMillis=-53111462400000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOf...#319#548864066", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "indexOfSupported", "org.joda.time.DurationFieldType", "<null>"}}), new String[][]{{"get", "org.joda.time.ReadablePartial,long", "5"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1970, 1970]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.joda.time.Partial", "getFieldTypes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.joda.time.Partial", "withPeriodAdded", "org.joda.time.ReadablePeriod,int", "<sample:5>", "2147483647"}}), new String[][]{{"getField", "", "5"}, {"getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0007 {getFieldTypes=[year, year, year], getFields=[DateTimeField[year], DateTimeField[year], DateTimeField[yea.., getValues=[7], size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:X>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toStringList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "getValue", "int", "-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[clockhourOfHalfday=6]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[clockhourOfHalfday=6] {getFieldTypes=[clockhourOfHalfday], getFields=[DateTimeField[clockhourOfHalfday]], getValues=[6], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "compareTo", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.joda.time.Partial", "isBefore", "org.joda.time.ReadablePartial", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getPrinter", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", actual.getClass().getName());
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("968365", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withField", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 5, new String[][]{{"org.joda.time.Partial", "getField", "int,org.joda.time.Chronology", "7", "<sample:7>"}, {"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getValues", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.Partial", "getChronology", ""}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[3, 4, 5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false), new String[][]{{"get", "org.joda.time.ReadablePeriod,long,long", "7"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "size", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:4>"}}), new String[][]{{"add", "long,long,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "minus", new String[]{"org.joda.time.ReadablePeriod"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.joda.time.Partial", "size", ""}, {"org.joda.time.Partial", "toStringList", ""}}), new String[][]{{"getField", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}, {"org.joda.time.Partial", "withFieldAddWrapped", "org.joda.time.DurationFieldType,int", "<sample:8>", "138"}}), new String[][]{{"getMaximumValueOverall", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("292278993", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withChronologyRetainFields", new String[]{"org.joda.time.Chronology"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.joda.time.Partial", "isMatch", "org.joda.time.ReadablePartial", "<sample:3>"}}), new String[][]{{"withChronologyRetainFields", "org.joda.time.Chronology", "5"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toDateTime", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:3>"}, false), new String[][]{{"plusMinutes", "int", "5"}, {"plusDays", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTime", actual.getClass().getName());
  assertEquals("1970-01-02T16:02:00.001-08:00 {getCenturyOfEra=20, getDayOfMonth=2, getDayOfWeek=5, getDayOfYear=2, getEra=1, getHourOfDay=16, getMillis=172920001, getMillisOfDay=57720001, getMillisOfSecond=1, getMin...#332#1499763479", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "add", "long,long", "12324121189006", "-24648242378014"}, {"org.joda.time.field.UnsupportedDurationField", "getMillis", "long", "53278362873889"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UnsupportedDurationField[eras]", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:_key>"}, false, 3, new String[][]{{"org.joda.time.Partial", "minus", "org.joda.time.ReadablePeriod", "<sample:3>"}, {"org.joda.time.Partial", "equals", "java.lang.Object", "<s:ey>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOf", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<null>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "-2147483622"}, false, 5, new String[][]{{"org.joda.time.Partial", "indexOf", "org.joda.time.DurationFieldType", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isMatch", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.joda.time.Partial", "withField", "org.joda.time.DateTimeFieldType,int", "<null>", "-1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "getType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "hashCode", ""}, {"org.joda.time.field.UnsupportedDurationField", "add", "long,int", "106556725747778", "-8"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("days {getName=days}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[days] {getName=days, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.field.UnsupportedDurationField", "org.joda.time.field.UnsupportedDurationField", "isSupported", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.field.UnsupportedDurationField", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "UnsupportedDurationField[eras] {getName=eras, getUnitMillis=0, isPrecise=true, isSupported=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getChronology", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.Partial", "getFormatter", ""}}), new String[][]{{"get", "org.joda.time.ReadablePartial,long", "6"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[1970, 1, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "with", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "128"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0128 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[128], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[DateTimeField[year]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DateTimeField;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withPeriodAdded", new String[]{"org.joda.time.ReadablePeriod", "int"}, new String[]{"<sample:0>", "-2147483647"}, false, 2, new String[][]{{"org.joda.time.Partial", "with", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Partial", actual.getClass().getName());
  assertEquals("0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "getField", new String[]{"int", "org.joda.time.Chronology"}, new String[]{"2013265919", "<sample:1>"}, false, 2, new String[][]{{"org.joda.time.Partial", "toDateTime", "org.joda.time.ReadableInstant", "<sample:6>"}, {"org.joda.time.Partial", "getChronology", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isBefore", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.joda.time.Partial", "withChronologyRetainFields", "org.joda.time.Chronology", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0006 {getFieldTypes=[year, year], getFields=[DateTimeField[year], DateTimeField[year]], getValues=[6, 7, 8], size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "isAfter", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.Partial", "getField", "int", "2147483635"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "0001 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[1], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 4, new String[][]{{"org.joda.time.Partial", "plus", "org.joda.time.ReadablePeriod", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "property", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.joda.time.Partial", "toString", "java.lang.String,java.util.Locale", "--1", "<null>"}, {"org.joda.time.Partial", "getValues", ""}}), new String[][]{{"getFieldType", "", "2"}, {"getDurationType", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DurationFieldType$StandardDurationFieldType", actual.getClass().getName());
  assertEquals("years {getName=years}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3, 4, 5], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "withFieldAdded", new String[]{"org.joda.time.DurationFieldType", "int"}, new String[]{"<sample:6>", "2147483647"}, false, 0, new String[][]{{"org.joda.time.Partial", "isAfter", "org.joda.time.ReadablePartial", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "indexOfSupported", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.joda.time.Partial", "getChronology", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0003 {getFieldTypes=[year], getFields=[DateTimeField[year]], getValues=[3], size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.Partial", "org.joda.time.Partial", "toString", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"0x1234567890", "<empty>"}, false, 0, new String[][]{{"org.joda.time.Partial", "compareTo", "org.joda.time.ReadablePartial", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0\ufffd1234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getFieldTypes=[], getFields=[], getValues=[], size=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
