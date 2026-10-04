package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"+t\"a\"9\n1+1"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "-1.5"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", ".{ "}, {"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "abc"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"1.5fabc"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, , a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", ".5"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.22345678901234567"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.22345678901234567"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.22345678901234567"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.22345678901234567"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.22345678901234567"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.22345678901234567"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=10, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=12, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=12, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=64, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=100, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=255, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=256, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toMap", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "16"}, {"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "\t"}, {"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "\t"}, {"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"2"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:1>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1.1234567"}}, 3), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:1>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1.1234567"}}, 3), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "putIn", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "010"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "THTLD"}, {"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<null>"}}, 1), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "THTLD"}, {"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<null>"}}, 1), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "THTLD"}, {"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<null>"}}, 1), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1"}}, 1), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1"}}, 1), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1"}}, 1), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=10, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1"}}, 1), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"f"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=256, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=1000, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=-2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toMap", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{".{ "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"2020-02-30T5:h1:61"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, , a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "010PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "putIn", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=-10, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=2, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=3, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=4, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 24, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=5, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 25, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=6, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=16, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=32, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=64, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:3>"}}), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "12345678901234567890123456890"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1.d"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"11?dnull"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "1.5"}, {"org.apache.commons.csv.CSVRecord", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=32, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.Enum"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:3>"}, {"org.apache.commons.csv.CSVRecord", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=10, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1"}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=10, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:2>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1"}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:2>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1"}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=12, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=10, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=12, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=-10, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=2, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=3, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=4, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=5, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=6, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=7, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=8, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}, {"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=9, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "50"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "50"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVRecord", "get", "int", "50"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=10, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=12, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "putIn", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "<null>"}, {"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toMap", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"next", "", "0"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"next", "", "0"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 3), new String[][]{{"next", "", "0"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 3), new String[][]{{"next", "", "0"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=16, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "putIn", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.1234567"}, {"org.apache.commons.csv.CSVRecord", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{",t\"p\""}, false, 12, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=16, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{",t\"p!!"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:0>"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "a "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=10, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=12, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=16, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=32, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=64, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=100, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:3>"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=255, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:3>"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=256, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:3>"}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=64, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=100, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=255, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=256, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=1000, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=-2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, , a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"6..\n,26l"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=64, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"next", "", "4"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"next", "", "4"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=16, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, , a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=32, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=100, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=255, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=256, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", ",1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", ",1L"}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", ",1L"}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 2), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=32, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 2), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=64, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.Enum"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:3>"}, {"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<null>"}, {"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=10, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=12, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=16, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=32, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=64, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"214483648"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"21474836812:30:45"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "toMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.Enum"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=100, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=255, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "Titke"}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=256, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "Titke"}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=1000, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "Titke"}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=-2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", ".5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=16, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{".{ /a/b"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getComment=sample, getRecordNumber=9, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1.1234568890123456"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 2), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=32, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=64, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "putIn", "java.util.Map", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.Enum"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:2>"}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"-33"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVRecord", "toMap", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}, {"org.apache.commons.csv.CSVRecord", "get", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getComment=, getRecordNumber=10, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVRecord", "toMap", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}, {"org.apache.commons.csv.CSVRecord", "get", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getComment=a, getRecordNumber=11, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVRecord", "toMap", ""}, {"org.apache.commons.csv.CSVRecord", "toMap", ""}, {"org.apache.commons.csv.CSVRecord", "get", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a] {getComment=0, getRecordNumber=12, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.Enum", "<sample:1>"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 2), new String[][]{{"hasNext", "", "4"}, {"hasNext", "", "4"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
}
