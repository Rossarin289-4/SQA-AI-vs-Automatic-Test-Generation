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
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:4>"}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "clone", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:1>", "-2.21059361979498957E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"//b"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:4>", "-8.988465674311579E307"}, {"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "-1", "-2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#238#1329896861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getKey", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:2>", "<i:-1>"}}), new String[][]{{"delete", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("573579631", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=null, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#240#-106841703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"507", "-2147483648"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "null"}, {"org.jfree.data.time.TimePeriodValues", "hashCode", ""}}, 1), new String[][]{{"getNotify", "", "7"}, {"getNotify", "", "2"}, {"getDomainDescription", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=null, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1123843896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:4>", "2"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:1>", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=1, getMinMiddleIndex=1, getMinStartIndex=1, getNotify=true, g...#240#695534730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDataItem", "int", "-2147483647"}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1643569788", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#244#656414604", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "update", new String[]{"int", "java.lang.Number"}, new String[]{"0", "<d:0.75>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:4>", "NaN"}, {"org.jfree.data.time.TimePeriodValues", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getTimePeriod", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:1>", "<d:-0.5>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:3>", "-2.21059361979498957E18"}}), new String[][]{{"compareTo", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=1, getMaxMiddleIndex=1, getMaxStartIndex=1, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#2038908844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setKey", "java.lang.Comparable", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-10", "2"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<d:30.0>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<i:-32>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:3>"}, {"org.jfree.data.time.TimePeriodValues", "update", "int,java.lang.Number", "2147483647", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getTimePeriod", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:0>", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "double"}, new String[]{"<sample:1>", "Infinity"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<s:ley>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:3>", "2.0000000000000004"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getTimePeriod", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"1-5"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getTimePeriod", "int", "6"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1-5, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#240#-547653949", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "double"}, new String[]{"<sample:7>", "NaN"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:5>", "4.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=1, getMaxMiddleIndex=1, getMaxStartIndex=1, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#2038908844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "2147483648"}, {"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#250#765207206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getKey", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=http://example.com/a?b=c, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartI...#265#1352500727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-3", "2"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:7>", "1.7976931348623157E308"}, {"org.jfree.data.time.TimePeriodValues", "getDataItem", "int", "2146435071"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getKey", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1", "<s:>", "<s:>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"a \"b", "<s:b>", "<s:a>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", ""}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#237#1464408903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"-1", "6"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "isEmpty", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"-1048574"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "54", "1"}}, 3), new String[][]{{"getRangeDescription", "", "2"}, {"getMaxEndIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, null, 2), new String[][]{{"getNotify", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:3.06>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"a", "<s:ke8y+>", "<s:ke_>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"<a>b</a>/a/b", "<sample:0>", "<i:33>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<s:k\"y>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "update", new String[]{"int", "java.lang.Number"}, new String[]{"2147483647", "<i:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "update", new String[]{"int", "java.lang.Number"}, new String[]{"20", "<d:-0.5>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-12", "-2147483648"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getValue", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1.12\"45678"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setKey", "java.lang.Comparable", "<s:>"}, {"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#250#1111456033", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2", "-524298"}, false, 0, null, 2), new String[][]{{"getMaxStartIndex", "", "2"}, {"setDescription", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=a, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#242#1290073276", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:7>", "<d:-0.5>"}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "http://example.comca?b=c"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=http://example.comca?b=c, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=...#260#-1464288905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"2147483647", "-21"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{".+"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=.+, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tru...#239#1836543535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "10", "-2147483647"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"19"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDataItem", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "12", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "0xEFFFFFFF"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<null>", "<i:54>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xEFFFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#247#-1782894530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"2147483604", "0"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "update", new String[]{"int", "java.lang.Number"}, new String[]{"10", "<i:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "abd"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abd", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#243#-1000746420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "6", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483646", "-42"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:5>"}}, 3), new String[][]{{"setDescription", "java.lang.String", "7"}, {"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "update", "int,java.lang.Number", "0", "<i:-35>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getTimePeriod", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setKey", "java.lang.Comparable", "<d:6.0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "0y1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2964654", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=0y1F, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1798113967", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"1073741823", "2147483647"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1.5c", "<s:a>", "<d:0.15>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:5>"}, {"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "-i"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=-i, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tru...#243#-1908310835", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106986337", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "double"}, new String[]{"<sample:5>", "4.0"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"-21", "1"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:4>", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:2>", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"-,n", "<sample:1>", "<s:b>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "\t1.5d", "<b:true>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1L, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true, ...#236#-1813672641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "update", new String[]{"int", "java.lang.Number"}, new String[]{"16374", "<d:3.0>"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "isEmpty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1.11234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#250#-651214733", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"1", "-1"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"--", "<i:0>", "<i:-89>"}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:7>", "-1.0"}, {"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "getNotify", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=-1, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tru...#239#-1861687210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "h"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#241#1743168295", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<null>", "<i:0>"}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "0", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<i:-257>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106986337", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDataItem", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:3>"}, {"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "-2147483648", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:1.437>"}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"3", "1"}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:1>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "Null itea b"}, {"org.jfree.data.time.TimePeriodValues", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Null itea b, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getN...#252#-1719842741", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:0>", "NaN"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:0>", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#-328038453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:7>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:7>", "-4.4211872395899791E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:6>", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#243#481728599", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"12", "1"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:6>", "<d:0.3>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#236#-5928968", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getTimePeriod", new String[]{"int"}, new String[]{"20"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getValue", "int", "12"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:3>", "<d:-0.9810000000000001>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:5>", "42.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"31", "2"}, false), new String[][]{{"getKey", "", "6"}, {"getMaxMiddleIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-999498656", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<null>", "2.0"}, {"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#243#-1980253053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"2147483627", "-21"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"1/a b"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1/a b, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#242#-63470417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#243#481728599", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "clone", ""}, {"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"1.25Range"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1.25Range, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#243#1734991945", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"1e10tru"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getTimePeriod", "int", "21"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1e10tru, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotif...#248#1332953101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#270#-205880638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1.5f\u00e9", "<sample:1>", "<i:1>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=1.5, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#241#-619743985", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"+2", "<i:2>", "<sample:1>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "LRan[e"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=LRan[e, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#247#826679054", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"0", "-2147483648"}, false), new String[][]{{"getKey", "", "1"}, {"getRangeDescription", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"PT11H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1243780971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "double"}, new String[]{"<sample:1>", "-0.0"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "-1073741824", "524"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<i:-524287>"}, {"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDataItem", "int", "-72"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"trueTime1.5f", "<b:true>", "<d:0.71>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"-3", "-56"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"nu.ll1"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", ","}, {"org.jfree.data.time.TimePeriodValues", "setKey", "java.lang.Comparable", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=nu.ll1, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#243#2135842108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:9>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "Value"}}), new String[][]{{"getTimePeriod", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:5>", "2.21059361979498982E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<d:-0.05>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "http://example-com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=http://example-com/a?b=c, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartI...#265#-358150120", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:8>", "<d:30.0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=false, ...#241#-1249891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:3>"}}), new String[][]{{"setDescription", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=0, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#237#-1690199651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:7>", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=1, getMaxMiddleIndex=1, getMaxStartIndex=1, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#2038908844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-21", "-65512"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}}), new String[][]{{"getTimePeriod", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:5>"}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=fals...#239#106350848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:0>", "-2.21059361979498957E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", " \t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription= \t, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tru...#243#1411484412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"21", "11"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}}), new String[][]{{"removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<d:65.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "/a/"}, {"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#243#1543428882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getValue", "int", "0"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:3>", "-2.21059361979498957E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:2>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=1, getMinMiddleIndex=1, getMinStartIndex=1, getNotify=true, g...#240#695534730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "2", "-63"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#-813795241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "bc010"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:6>", "-2.21059361979498982E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=bc010, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true...#238#623176515", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:1>", "-0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "double"}, new String[]{"<null>", "-0.024000000000000004"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "getNotify", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#241#129114748", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:2>"}, {"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "33", "35"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDataItem", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setKey", "java.lang.Comparable", "<s:jey>"}, {"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true,...#241#1818988229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", ".4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=.4, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tru...#243#-815583041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<null>"}, {"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2", "-36"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}}), new String[][]{{"getDescription", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "  "}, {"org.jfree.data.time.TimePeriodValues", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "2Value", "<i:-16>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=  , getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#240#-1031605617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1076786014", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=true, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#-721836545", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"11L"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "isEmpty", ""}, {"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=11L, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#244#-1127672619", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:5>", "1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1L1L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#244#-523784323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:1>", "8.000000000000002"}, {"org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"Helmo, World"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=Helmo, World, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNot...#246#-1201251823", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"-1TITLE"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=-1TITLE, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotif...#248#1691688809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "-2210593619794989709"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=-2210593619794989709, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex...#261#-671482002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "-536870936"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getValue", "int", "-2097152"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#239#-2011928964", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "6"}, false), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2044644697", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "-2147483648", "0"}}), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:3>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:7>", "<d:-0.25>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=1, getMaxMiddleIndex=1, getMaxStartIndex=1, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#2038908844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "nulk"}}), new String[][]{{"addChangeListener", "org.jfree.data.general.SeriesChangeListener", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=nulk, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#777096853", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=nulk, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#777096853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getMinMiddleIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true, ge...#234#-1833690684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"2147483647", "1073741804"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2.5f, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-981489444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"6xFFFFFFFF"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=6xFFFFFFFF, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNo...#251#630440451", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}}), new String[][]{{"getDescription", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setKey", "java.lang.Comparable", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:9>", "<i:1>"}, {"org.jfree.data.time.TimePeriodValues", "getDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483634"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}}), new String[][]{{"getKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:7>", "-2.4000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106986337", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"Px0H"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Px0H, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1885526321", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:4>"}, {"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "update", "int,java.lang.Number", "2147483647", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"\n\n"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#244#1614715990", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "2", "4096"}, {"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "Rangf"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=Rangf, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#246#-1421434465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=Rangf, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#246#-1421434465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getValue", "int", "262156"}, {"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#239#2063249161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"a2", "<sample:0>", "<i:-262143>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "010{\"a\":1}<a>b</a>"}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=010{\"a\":1}<a>b</a>, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-...#256#99715441", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=010{\"a\":1}<a>b</a>, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-...#256#99715441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getDomainDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDescription", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106986337", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:0>", "<i:-2147483648>"}, {"org.jfree.data.time.TimePeriodValues", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", ".", "<s:keyX>", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "double"}, new String[]{"<sample:3>", "-0.05"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "20", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "double"}, new String[]{"<null>", "-1.7976931348623158E307"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:6>", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-970348240", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"+"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "isEmpty", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=+, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#242#1001294484", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "1e10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1e10, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#-1411235804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=false, ...#241#-1249891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "3", "21"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "-15."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=-15., getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#-930710232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("404383321", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#241#1232634118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "4"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "getNotify", ""}}, 1), new String[][]{{"add", "org.jfree.data.time.TimePeriod,java.lang.Number", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "a b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#243#896195148", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getDomainDescription", "", "5"}, {"addPropertyChangeListener", "java.beans.PropertyChangeListener", "5"}, {"getItemCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"--10xFFFFFFFF"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=--10xFFFFFFFF, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, ge...#254#-351992956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"1.252"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1525639229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-1", "-2048"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "5R."}}, 1), new String[][]{{"setRangeDescription", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=5R., getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#240#1433226299", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=5R., getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#244#644067322", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "http://example.com/a?b=c1.5e300"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=http://example.com/a?b=c1.5e300, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMi...#272#-1188549731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "ac"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=ac, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, get...#238#675381783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "-22105936197949897091L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#262#-1010447557", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "22020-01-L1"}, {"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1188778129", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1L, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tru...#243#843583980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1614800385", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "/a/b2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1919703987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#263#143892564", SearchInputFactory_scaffolding.receiverState());
 }
}
