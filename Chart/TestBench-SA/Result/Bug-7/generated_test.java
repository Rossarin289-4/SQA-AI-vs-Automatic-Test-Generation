package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-1", "2"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"4194188", "-262144"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:4>", "NaN"}, {"org.jfree.data.time.TimePeriodValues", "getTimePeriod", "int", "-196"}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1.1234567890123456"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#253#-359841424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:6>", "<i:0>"}, {"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "1.5e300"}, {"org.jfree.data.time.TimePeriodValues", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1080269353", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=1.5e300, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=tr...#240#-277111541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:3>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:6>", "<d:1.5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=+1, getItemCount=2, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=1, getMinMiddleIndex=1, getMinStartIndex=1, getNotify=true, get...#234#-691883760", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "<null>"}, {"org.jfree.data.time.TimePeriodValues", "getNotify", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1643569788", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#244#656414604", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:4>"}, {"org.jfree.data.time.TimePeriodValues", "update", "int,java.lang.Number", "0", "<d:-0.5>"}, {"org.jfree.data.time.TimePeriodValues", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:9>"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:4>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:1>"}, {"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "1", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=1, getMaxMiddleIndex=1, getMaxStartIndex=1, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1042087104", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-963003820", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=null, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1123843896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:4>", "-2.21059361979498957E18"}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}, {"org.jfree.data.time.TimePeriodValues", "getTimePeriod", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=false, ...#241#-1249891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<null>"}, {"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "--1"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:5>", "-10.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=--1, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, ge...#239#1431014270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "1"}, false, 0, null, 1), new String[][]{{"getMaxMiddleIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "536870913"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2147483617", "536870913"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<null>"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 1), new String[][]{{"add", "org.jfree.data.time.TimePeriodValue", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:3>", "<i:1>"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "[1,2]"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Null  item not alloxed."}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147483648, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNo...#269#-312997327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Null  item not alloxed."}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2147d483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147d483648, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getN...#270#1758890441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Null  Xitem not alloxed."}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2147d483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147d483648, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getN...#271#-1583363597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Null  Xitem not alloxed."}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2147d483648"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:3>", "-2210593619794989709"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147d483648, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=...#266#-68250795", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2147d483648"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:3>", "-2210593619794989709"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147d483648, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=...#249#-491488217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getValue", "int", "2"}, {"org.jfree.data.time.TimePeriodValues", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getValue", "int", "2"}, {"org.jfree.data.time.TimePeriodValues", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getValue", "int", "2"}, {"org.jfree.data.time.TimePeriodValues", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:7>"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:7>"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<d:15.0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}, {"org.jfree.data.time.TimePeriodValues", "getDescription", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getTimePeriod", new String[]{"int"}, new String[]{"20"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-327678", "2147483647"}, false, 0, null, 2), new String[][]{{"getValue", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483647", "2147483647"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}}, 2), new String[][]{{"fireSeriesChanged", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483617"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "getKey", ""}, {"org.jfree.data.time.TimePeriodValues", "getKey", ""}}, 3), new String[][]{{"add", "org.jfree.data.time.TimePeriod,double", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"0", "<i:1>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "2", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "-1", "1073741823"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "-1", "1073741823"}, {"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "-1", "1073741823"}, {"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:2>", "<i:-1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:5>"}, false, 14, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "-1", "1073741823"}, {"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:2>", "<i:-1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:3>", "<d:-0.5>"}, {"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:3>", "<d:0.5>"}, {"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:3>", "<d:0.25>"}, {"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "a,b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a,b,c, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#246#1008741367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "a,b,c+"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a,b,c+, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#247#-2104691634", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "update", "int,java.lang.Number", "3", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "-2147483648", "0"}, {"org.jfree.data.time.TimePeriodValues", "getTimePeriod", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDescription", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDescription", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDescription", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getValue", "int", "2147483617"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getKey", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:5>", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "update", new String[]{"int", "java.lang.Number"}, new String[]{"2", "<d:-0.5>"}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-1", "2"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<null>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:2>", "<i:1>"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}, {"org.jfree.data.time.TimePeriodValues", "update", "int,java.lang.Number", "2147483647", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106986337", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:3>", "<i:1>"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "[1,2]"}}), new String[][]{{"getNotify", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=[1,2], getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#246#1885022346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "update", "int,java.lang.Number", "3", "<i:0>"}, {"org.jfree.data.time.TimePeriodValues", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:4>"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#244#1729265696", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#244#1729265696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1e10-1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#246#1690655292", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#246#1690655292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1e10-1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#248#-2050134561", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#248#-2050134561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1e10-0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#248#-1539600384", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#248#-1539600384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1e10-/"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#248#-1029066207", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#248#-1029066207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"a,b,c", "<s:key>", "<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"-2147483648", "1"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "delete", new String[]{"int", "int"}, new String[]{"1073741823", "2147483647"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "1073741823", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "1073741823", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:4>", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:2>", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:2>", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:1>", "2"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:6>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=1, getMaxMiddleIndex=1, getMaxStartIndex=1, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#2038908844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:1>", "2"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:6>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=2, getMaxEndIndex=1, getMaxMiddleIndex=1, getMaxStartIndex=1, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#626760287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getRangeDescription", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:1>", "2"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:6>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=2, getMaxEndIndex=1, getMaxMiddleIndex=1, getMaxStartIndex=1, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-765680110", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "1.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1.12345678901234567, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=...#260#-1568340635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "1.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1.12345678901234567, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=...#255#-396407988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "1.12345678901234567"}, {"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "0", "-1073741824"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1.12345678901234567, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=...#256#399511334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Null item not allowed."}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2147483648"}, {"org.jfree.data.time.TimePeriodValues", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147483648, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNo...#268#-1577459502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Null  item not allowed."}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2147483648"}, {"org.jfree.data.time.TimePeriodValues", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147483648, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNo...#269#531474544", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Null  item not alloxed."}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=2147483648, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNo...#269#-312997327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false), new String[][]{{"delete", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "isEmpty", ""}, {"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "double"}, new String[]{"<sample:2>", "1.0"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "1", "2147483617"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"10", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:7>", "<i:0>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:1>", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#242#843819597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<null>", "<d:-0.5>"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}, {"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<d:-0.5>"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}, {"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:4>", "<d:1.0>"}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}, {"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}, {"org.jfree.data.time.TimePeriodValues", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getTimePeriod", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483617"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "getKey", ""}, {"org.jfree.data.time.TimePeriodValues", "getKey", ""}}), new String[][]{{"add", "org.jfree.data.time.TimePeriod,double", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinEndIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:2>", "<d:-0.5>"}, {"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:2>", "<d:-0.5>"}, {"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,java.lang.Number", "<sample:2>", "<d:-0.5>"}, {"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<sample:0>"}, {"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<sample:0>"}, {"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Range"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#-215280942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setRangeDescription", new String[]{"java.lang.String"}, new String[]{"Range"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#247#1188069071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "update", new String[]{"int", "java.lang.Number"}, new String[]{"2147483617", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "{\"a\":1}", "<s:a>", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:5>", "<d:-0.25>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=1, getMinMiddleIndex=1, getMinStartIndex=1, getNotify=true, g...#240#695534730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:-0.25>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=1, getMaxMiddleIndex=1, getMaxStartIndex=1, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#2038908844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "java.lang.Number"}, new String[]{"<sample:6>", "<d:-0.00125>"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:1>"}, {"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=2, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#-328038453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"\t"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=\t, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#242#468507634", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"F"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=F, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#242#-1607351697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true,...#241#-1662012175", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{":"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=:, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#242#983702371", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1.5d, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#-1762767971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDataItem", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimePeriodValues", "hashCode", ""}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1e<10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#242#-984729516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1e<10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#846334504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDomainDescription", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "update", "int,java.lang.Number", "3", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinStartIndex", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#243#-1980253053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:5>", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:c>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "Range"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#-215280942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:cc>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:1>"}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "Range"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#247#1188069071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:cc>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:1>"}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "Qange"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#247#1596893296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:1>"}, {"org.jfree.data.time.TimePeriodValues", "getTimePeriod", "int", "1"}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "Qange0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#248#2062308994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#241#-242223042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "update", new String[]{"int", "java.lang.Number"}, new String[]{"1", "<d:-0.5>"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}, {"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#244#-465690925", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}, {"org.jfree.data.time.TimePeriodValues", "createCopy", "int,int", "2", "-1"}}), new String[][]{{"getItemCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:3>", "Infinity"}, {"org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "<null>"}, {"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=null, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1123843896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxEndIndex", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "Time"}, {"org.jfree.data.time.TimePeriodValues", "getNotify", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#240#-954829581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "2020-01-01"}, {"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#250#1748475319", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removeChangeListener", new String[]{"org.jfree.data.general.SeriesChangeListener"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "2020-01-01"}, {"org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#250#1748475319", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:0>", "-2210593619794989709"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:0>", "-2210593619794989709"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxMiddleIndex", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "removeChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=TITLE, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#246#1050885061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"TISLE"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=TISLE, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#246#-1908708506", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"TISLE "}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=TISLE , getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#247#-1494529956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"TISLE"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=TISLE, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#246#-1908708506", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"TISLE"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=TISLE, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotif...#243#1172153486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"SISLE"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=SISLE, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotif...#243#245398733", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"SISSLE"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=SISSLE, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNoti...#244#-237574274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"i"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "notifyListeners", "org.jfree.data.general.SeriesChangeEvent", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=i, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#239#1434193152", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=\u00e9, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#242#1753605428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=\u00e9, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#239#907292032", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getNotify", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:7>", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:7>", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, getR...#233#1035150431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:7>", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"Range"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=Range, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=...#246#-1866971776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=fals...#239#106350848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setNotify", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "addChangeListener", "org.jfree.data.general.SeriesChangeListener", "<sample:7>"}, {"org.jfree.data.time.TimePeriodValues", "getKey", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getTimePeriod", "int", "1073741823"}, {"org.jfree.data.time.TimePeriodValues", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-33>"}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "0x1F", "<s:b>", "<s:>"}, {"org.jfree.data.time.TimePeriodValues", "getMinStartIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDescription", new String[]{"java.lang.String"}, new String[]{"i"}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=i, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true, g...#235#-404016715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:5>", "-2210593619794989709"}, {"org.jfree.data.time.TimePeriodValues", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriod,double", "<sample:5>", "1.0"}, {"org.jfree.data.time.TimePeriodValues", "getDataItem", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "true"}, {"org.jfree.data.time.TimePeriodValues", "setKey", "java.lang.Comparable", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=true, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#-721836545", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "tru"}, {"org.jfree.data.time.TimePeriodValues", "setKey", "java.lang.Comparable", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=tru, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#244#-597787616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<s:kemz>"}, {"org.jfree.data.time.TimePeriodValues", "add", "org.jfree.data.time.TimePeriodValue", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDataItem", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriodValue"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getDataItem", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true,...#237#-336864238", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "1L"}, {"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<s:Ra>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1L, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tru...#243#843583980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "Null item not allowed."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#262#1502416044", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}, {"org.jfree.data.time.TimePeriodValues", "setRangeDescription", "java.lang.String", "Null item not allowed."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#264#1647802959", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "createCopy", new String[]{"int", "int"}, new String[]{"2147483647", "1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.time.TimePeriodValues", actual.getClass().getName());
  assertEquals("{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "add", new String[]{"org.jfree.data.time.TimePeriod", "double"}, new String[]{"<sample:7>", "-1.0"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getNotify", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=1, getMaxEndIndex=0, getMaxMiddleIndex=0, getMaxStartIndex=0, getMinEndIndex=0, getMinMiddleIndex=0, getMinStartIndex=0, getNotify=true, g...#240#654954924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2044644697", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getItemCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-999498656", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=fals...#239#106350848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDescription", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=a, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#238#-2044707189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "a \"", "<sample:0>", "<s:b>"}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106986337", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=f...#246#1348315883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.time.TimePeriodValues", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "a \"", "<sample:0>", "<s:b>"}, {"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2044644697", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#243#-1980253053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setKey", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "getDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription= , getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#239#1332038263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "notifyListeners", new String[]{"org.jfree.data.general.SeriesChangeEvent"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getRangeDescription", ""}, {"org.jfree.data.time.TimePeriodValues", "getDescription", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=+1, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tru...#243#-1483588393", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "setDomainDescription", new String[]{"java.lang.String"}, new String[]{"++1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=++1, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#244#-1846397510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getMaxStartIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getMinEndIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "Time"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=Time, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1132044152", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "ime"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=ime, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#244#-1482300836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1073741885>"}, false, 14, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setNotify", "boolean", "false"}, {"org.jfree.data.time.TimePeriodValues", "setDescription", "java.lang.String", "ime"}, {"org.jfree.data.time.TimePeriodValues", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "nulla", "<s:a>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=ime, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=fa...#245#-734831507", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "getTimePeriod", "int", "1073741823"}, {"org.jfree.data.time.TimePeriodValues", "firePropertyChange", "java.lang.String,java.lang.Object,java.lang.Object", "2", "<null>", "<i:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "Time"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#240#-954829581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "536870913", "1073741815"}, {"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "Time"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#240#-954829581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jfree.data.time.TimePeriodValues", "delete", "int,int", "536870913", "1073741815"}, {"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "Tie"}, {"org.jfree.data.time.TimePeriodValues", "getMinMiddleIndex", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Tie, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=tr...#239#1621914648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "firePropertyChange", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"twu", "<null>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "equals", "java.lang.Object", "<i:-32726>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=Time, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=t...#245#1910033438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "removePropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=sample, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify...#242#-2045591850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getValue", new String[]{"int"}, new String[]{"-2147450880"}, false, 10, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}, {"org.jfree.data.time.TimePeriodValues", "fireSeriesChanged", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", new String[]{"java.beans.PropertyChangeListener"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "1.1234567890123456"}, {"org.jfree.data.time.TimePeriodValues", "getKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=1.1234567890123456, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-...#259#-414395252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDataItem", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.jfree.data.time.TimePeriodValues", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "2"}, {"org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=2, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#242#-152239781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.time.TimePeriodValues", "org.jfree.data.time.TimePeriodValues", "getDomainDescription", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.time.TimePeriodValues", "setDomainDescription", "java.lang.String", "3"}, {"org.jfree.data.time.TimePeriodValues", "addPropertyChangeListener", "java.beans.PropertyChangeListener", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDescription=null, getDomainDescription=3, getItemCount=0, getMaxEndIndex=-1, getMaxMiddleIndex=-1, getMaxStartIndex=-1, getMinEndIndex=-1, getMinMiddleIndex=-1, getMinStartIndex=-1, getNotify=true...#242#2137236636", SearchInputFactory_scaffolding.receiverState());
 }
}
